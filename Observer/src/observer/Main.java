package observer;

public class Main {

	public static void main(String[] args) {
		// this will maintain all loans information
        Newspaper printMedia = new Newspaper();
        Internet onlineMedia = new Internet();
        Newspaper throwAwayPaper = new Newspaper();

        Loan personalLoan = new Loan("Personal Loan", 12.5f,
                     "Bancomer");
        personalLoan.registerObserver(printMedia);
        personalLoan.registerObserver(onlineMedia);
        personalLoan.registerObserver(throwAwayPaper);
        personalLoan.setInterest(2.3f);
        System.out.println();
        personalLoan.removeObserver(throwAwayPaper);
        personalLoan.setInterest(3.5f);
	}

}
