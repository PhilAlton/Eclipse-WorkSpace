public class testMain {

	public static void main(String[] args) {
		PatientObsDataSet patientObsDataSet = new PatientObsDataSet();
		
		patientObsDataSet.respRate.value = 20;
		patientObsDataSet.spO2.value = 96;
		patientObsDataSet.inspiredO2.value = "RA";
		patientObsDataSet.temp.value = 36.1;
		patientObsDataSet.sistBP.value =  90;
		patientObsDataSet.heartRate.value = 90;
		patientObsDataSet.avpu.value = "A";
		
		
		ACEWScore ACEWScore = new ACEWScore(patientObsDataSet);
		System.out.println(ACEWScore.score);
		System.out.println(ACEWScore.qMET);
		
	}

}


