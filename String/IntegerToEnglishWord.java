class Solution {
    public String numberToWords(int num) {
  var dictionary = getDictionary();
        if (num == 0) {
            return dictionary.get(0L);
        }
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int dividedNum = num;
        while (dividedNum > 0) {
            dividedNum = dividedNum / 1000;
            if (dividedNum > 0) {
                i++;
            }
        }
        while (i >= 0) {
            if (i == 3) {
                sb.append(getThreeNumbers(num / 1000000000));
                sb.append(" ").append(dictionary.get(1000000000L)).append(" ");
                i--;
                num = num % 1000000000;
                continue;
            }
            if (i == 2) {
                String s = getThreeNumbers(num / 1000000);
                if (!s.isEmpty()) {
                    sb.append(getThreeNumbers(num / 1000000));
                    sb.append(" ").append(dictionary.get(1000000L)).append(" ");
                }
                i--;
                num = num % 1000000;
                continue;
            }
            if (i == 1) {
                String s = getThreeNumbers(num / 1000);
                if (!s.isEmpty()) {
                    sb.append(getThreeNumbers(num / 1000));
                    sb.append(" ").append(dictionary.get(1000L)).append(" ");
                }
                i--;
                num = num % 1000;
                continue;
            }
            if (i == 0) {
                sb.append(getThreeNumbers(num % 1000));
                break;
            }
        }
        return sb.toString().trim();
    }

    private static String getThreeNumbers(int num) {
        var dictionary = getDictionary();
        StringBuilder result = new StringBuilder();
        long dozen = num % 100;
        long countOfZeros = 0;
        String hundredths = "";
        boolean isHundredths = false;
        if (num / 100 > 0) {
            isHundredths = true;
            hundredths = dictionary.get(num / 100L);
        }
        if (dozen <= 20 && dozen != 0) {
            result.insert(0, " " + dictionary.get(dozen));
            num = num / 100;
            if (num > 0) {
                result.insert(0, dictionary.get(100L));
                result.insert(0, hundredths + " ");
            }
            num = 0;
        }
        if (num != 0) {
            while (num / 10 >= 0) {
                if (isHundredths && countOfZeros == 2) {
                    result.insert(0, dictionary.get(100L) + " ");
                    result.insert(0, hundredths + " ");
                    break;
                }
                if (num % 10 != 0) {
                    result.insert(0, dictionary.get(num % 10 * (Math.round(Math.pow(10, countOfZeros)))) + " ");
                }
                countOfZeros++;
                if (num / 10 == 0) {
                    break;
                }
                num = num / 10;
            }
        }
        return result.toString().trim();
    }

    private static Map<Long, String> getDictionary() {
        Map<Long, String> dictionary = new HashMap<>();
        dictionary.put(0L, "Zero");
        dictionary.put(1L, "One");
        dictionary.put(2L, "Two");
        dictionary.put(3L, "Three");
        dictionary.put(4L, "Four");
        dictionary.put(5L, "Five");
        dictionary.put(6L, "Six");
        dictionary.put(7L, "Seven");
        dictionary.put(8L, "Eight");
        dictionary.put(9L, "Nine");
        dictionary.put(10L, "Ten");
        dictionary.put(11L, "Eleven");
        dictionary.put(12L, "Twelve");
        dictionary.put(13L, "Thirteen");
        dictionary.put(14L, "Fourteen");
        dictionary.put(15L, "Fifteen");
        dictionary.put(16L, "Sixteen");
        dictionary.put(17L, "Seventeen");
        dictionary.put(18L, "Eighteen");
        dictionary.put(19L, "Nineteen");
        dictionary.put(20L, "Twenty");
        dictionary.put(30L, "Thirty");
        dictionary.put(40L, "Forty");
        dictionary.put(50L, "Fifty");
        dictionary.put(60L, "Sixty");
        dictionary.put(70L, "Seventy");
        dictionary.put(80L, "Eighty");
        dictionary.put(90L, "Ninety");
        dictionary.put(100L, "Hundred");
        dictionary.put(1000L, "Thousand");
        dictionary.put(1000000L, "Million");
        dictionary.put(1000000000L, "Billion");
        return dictionary;
    }
}
