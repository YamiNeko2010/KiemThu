public class PrimeChecker {
    public String checkPrime(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            return number + " là số nguyên tố.";
        } else {
            return number + " không là số nguyên tố.";
        }
    }
}