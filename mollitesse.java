private static int countMatches(int[] winningNumbers, int[] ticket) {
    int count = 0;
    for (int number : ticket) {
        for (int winningNumber : winningNumbers) {
            if (number == winningNumber) {
                count++;
                break;
            }
        }
    }
    return count;
}
