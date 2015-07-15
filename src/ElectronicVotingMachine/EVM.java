package ElectronicVotingMachine;

import java.util.ArrayList;

public class EVM {
	ControlUnit CU;
	BallotingUnit BU;
	ArrayList<Candidate> candidates = new ArrayList<Candidate>();
	
	EVM(){
		CU = new ControlUnit();
		BU = new BallotingUnit();
	}

	EVM(ArrayList<Candidate> c){
		CU = new ControlUnit();
		BU = new BallotingUnit();
		registerCandidates(c);
	}
	
	public void registerCandidates(ArrayList<Candidate> c) {
		candidates = c;
	}
	
	
}
