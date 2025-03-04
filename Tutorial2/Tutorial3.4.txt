class library {
    int fineAmount;
    library() {
        fineAmount = 5;
    }
    void displayFine() {
        System.out.println("Default fine = " + fineAmount);
    }

    public static void main(String[] args) {
        library obj = new library();
        obj.displayFine();
    }
}