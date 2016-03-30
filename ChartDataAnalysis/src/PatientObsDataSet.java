public class PatientObsDataSet {
	RespRate	<?> 	respRate 	= new RespRate<>();
	SpO2		<?> 	spO2 		= new SpO2<>();
	InspiredO2	<?> 	inspiredO2 	= new InspiredO2<>();
	Temp		<?> 	temp 		= new Temp<>();
	SistBP		<?> 	sistBP 		= new SistBP<>();
	HeartRate	<?> 	heartRate 	= new HeartRate<>();
	AVPU		<?> 	avpu 		= new AVPU<>();
	
	
	
	
	abstract class Parameter<T1>{
		private T1 value;
				
		<T4> void setValue(T4 value){this.value = (T1) value;}
		T1 getValue(){return this.value;}
		
	}
	
	
	public class RespRate<T1> extends Parameter<T1>{}
	public class SpO2<T1>  extends Parameter<T1>{}
	public class InspiredO2<T1> extends Parameter<T1>{}
	public class Temp<T1> extends Parameter<T1>{}
	public class SistBP<T1> extends Parameter<T1>{}
	public class HeartRate<T1>  extends Parameter<T1>{}
	public class AVPU<T1>  extends Parameter<T1>{}


	

}

