import java.util.Arrays;

public class testMain {

	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.patientObsSets[0] = new PatientObsDataSet();
		
		patient.patientObsSets[0].respRate.setValue(20);
		patient.patientObsSets[0].spO2.setValue(96);
		patient.patientObsSets[0].inspiredO2.setValue("RA");
		patient.patientObsSets[0].temp.setValue(36.1);
		patient.patientObsSets[0].sistBP.setValue(90);
		patient.patientObsSets[0].heartRate.setValue(90);
		patient.patientObsSets[0].avpu.setValue("A");
		
				
		patient.patientObsSets[0].respRate.setThresholds(12, 4, 5);
		patient.patientObsSets[0].spO2.setComparators(96);
		patient.patientObsSets[0].inspiredO2.setComparators("RA");
		patient.patientObsSets[0].temp.setComparators(36.1);
		patient.patientObsSets[0].sistBP.setComparators(90);
		patient.patientObsSets[0].heartRate.setComparators(90);
		patient.patientObsSets[0].avpu.setComparators("A");
		
		System.out.println(Arrays.toString(patient.patientObsSets[0].respRate.thresholds));
		
		System.out.println(patient.patientObsSets[0].respRate.value);
		System.out.println(patient.patientObsSets[0].spO2.value);
		System.out.println(patient.patientObsSets[0].inspiredO2.value);
		System.out.println(patient.patientObsSets[0].temp.value);
		System.out.println(patient.patientObsSets[0].sistBP.value);
		System.out.println(patient.patientObsSets[0].heartRate.value);
		System.out.println(patient.patientObsSets[0].avpu.value);
		
	//	System.out.println(patientObsDataSet.avpu.thresholds[0]);
		System.out.println();
		
		ACEWScore ACEWScore = new ACEWScore(patient.patientObsSets[0]);
		System.out.println(ACEWScore.score);
		System.out.println(ACEWScore.qMET);
		
	}

}


