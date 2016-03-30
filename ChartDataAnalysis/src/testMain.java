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
		
				
		patient.respRateThreshold.setThresholds(12, 4, 5);
		patient.respRateThreshold.setComparators(96);
		patient.respRateThreshold.setComparators("RA");
		patient.respRateThreshold.setComparators(36.1);
		patient.respRateThreshold.setComparators(90);
		patient.respRateThreshold.setComparators(90);
		patient.respRateThreshold.setComparators("A");
		
		System.out.println(Arrays.toString(patient.respRateThreshold.getThresholds()));
		
		System.out.println(patient.patientObsSets[0].respRate.getValue());
		System.out.println(patient.patientObsSets[0].spO2.getValue());
		System.out.println(patient.patientObsSets[0].inspiredO2.getValue());
		System.out.println(patient.patientObsSets[0].temp.getValue());
		System.out.println(patient.patientObsSets[0].sistBP.getValue());
		System.out.println(patient.patientObsSets[0].heartRate.getValue());
		System.out.println(patient.patientObsSets[0].avpu.getValue());
		
		System.out.println(patient.respRateThreshold.getThresholds()[1]);
		System.out.println();
		
		ACEWScore ACEWScore = new ACEWScore(patient.patientObsSets[0]);
		System.out.println(ACEWScore.score);
		System.out.println(ACEWScore.qMET);
		
	}

}


