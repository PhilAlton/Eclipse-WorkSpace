
public class Patient {

	public PatientObsDataSet[] patientObsSets = new PatientObsDataSet[1];
	
	Patient(){
		
		
	}
	
	
	abstract class thresholds<T2, T3>{
		public T2[] thresholds;
		public T3[] comparators;
		
		<T5> void setThresholds(T5... thresholds){this.thresholds = (T2[]) thresholds;}		
		<T6> void setComparators(T6... comparators){this.comparators = (T3[]) comparators;}
		
	}
	
	
}
