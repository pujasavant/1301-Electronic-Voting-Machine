package ElectronicVotingMachine;

import java.util.ArrayList;

/**
 * 
 * @author Pooja Savant
 * Roll No.: 1301
 * Program: Main class to perform Electronic Voting.
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EVM evm = new EVM();
		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
		Candidate c1 = new Candidate("Borkar");
		candidates.add(c1);
		Candidate c2 = new Candidate("Salgaonkar");
		candidates.add(c2);
		evm.registerCandidates(candidates);
	}
}
