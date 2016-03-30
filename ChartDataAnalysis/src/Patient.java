
public class Patient {
	RespRateThreshold	<?, ?> 	respRateThreshold 	= new RespRateThreshold<>();
	SpO2Threshold		<?, ?> 	spO2Threshold 		= new SpO2Threshold<>();
	InspiredO2Threshold	<?, ?> 	inspiredO2Threshold = new InspiredO2Threshold<>();
	TempThreshold		<?, ?> 	tempThreshold 		= new TempThreshold<>();
	SistBPThreshold		<?, ?> 	sistBPThreshold 	= new SistBPThreshold<>();
	HeartRateThreshold	<?, ?> 	heartRateThreshold 	= new HeartRateThreshold<>();
	AVPUThreshold		<?, ?> 	avpuThreshold 		= new AVPUThreshold<>();


	public PatientObsDataSet[] patientObsSets = new PatientObsDataSet[1];
	
	Patient(){
		respRateThreshold.setThresholds(12, 4, 5);
		respRateThreshold.setComparators(96);
	}
	
	
	abstract class Threshold<T2, T3>{
		private T2[] thresholds;
		private T3[] comparators;
		
		<T5> void setThresholds(T5... thresholds){this.thresholds = (T2[]) thresholds;}		
		<T6> void setComparators(T6... comparators){this.comparators = (T3[]) comparators;}
		
		T2[] getThresholds(){return this.thresholds;}
		T3[] getComparitors(){return this.comparators;}

		
	}
	
	
	public class RespRateThreshold<T2, T3> extends Threshold<T2, T3>{}
	public class SpO2Threshold<T2, T3>  extends Threshold<T2, T3>{}
	public class InspiredO2Threshold<T2, T3> extends Threshold<T2, T3>{}
	public class TempThreshold<T2, T3> extends Threshold<T2, T3>{}
	public class SistBPThreshold<T2, T3> extends Threshold<T2, T3>{}
	public class HeartRateThreshold<T2, T3>  extends Threshold<T2, T3>{}
	public class AVPUThreshold<T2, T3>  extends Threshold<T2, T3>{}

	
}
