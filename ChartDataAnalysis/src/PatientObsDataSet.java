public class PatientObsDataSet {
	RespRate	<?, ?, ?> 	respRate 	= new RespRate<>();
	SpO2		<?, ?, ?> 	spO2 		= new SpO2<>();
	InspiredO2	<?, ?, ?> 	inspiredO2 	= new InspiredO2<>();
	Temp		<?, ?, ?> 	temp 		= new Temp<>();
	SistBP		<?, ?, ?> 	sistBP 		= new SistBP<>();
	HeartRate	<?, ?, ?> 	heartRate 	= new HeartRate<>();
	AVPU		<?, ?, ?> 	avpu 		= new AVPU<>();
	
	
	
	
	abstract class Parameter<T1, T2, T3>{
		public T1 value;
		public T2[] thresholds;
		public T3[] comparators;
		
		<T4> void setValue(T4 value){this.value = (T1) value;}
		<T5> void setThresholds(T5... thresholds){this.thresholds = (T2[]) thresholds;}		
		<T6> void setComparators(T6... comparators){this.comparators = (T3[]) comparators;}
		
	}
	

	
	
	public class RespRate<T1, T2, T3> extends Parameter<T1, T2, T3>{}
	public class SpO2<T1, T2, T3>  extends Parameter<T1, T2, T3>{}
	public class InspiredO2<T1, T2, T3> extends Parameter<T1, T2, T3>{}
	public class Temp<T1, T2, T3> extends Parameter<T1, T2, T3>{}
	public class SistBP<T1, T2, T3> extends Parameter<T1, T2, T3>{}
	public class HeartRate<T1, T2, T3>  extends Parameter<T1, T2, T3>{}
	public class AVPU<T1, T2, T3>  extends Parameter<T1, T2, T3>{}


	

}

