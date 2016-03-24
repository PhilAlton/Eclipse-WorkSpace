import java.lang.reflect.Array;

public class PatientObsDataSet {
	
	RespRate<Integer, Array, Array> respRate = new RespRate<>();
	SpO2<Integer, Array, Array> spO2 = new SpO2<>();
	InspiredO2<Integer, Array, Array> inspiredO2 = new InspiredO2<>();
	Temp<Integer, Array, Array> temp = new Temp<>();
	SistBP<Integer, Array, Array> sistBP = new SistBP<>();
	HeartRate<Integer, Array, Array> heartRate = new HeartRate<>();
	AVPU<Integer, Array, Array> avpu = new AVPU<>();
	
	
	
	abstract class Parameter<T1, T2, T3>{
		public T1 value;
		public T2[] thresholds;
		public T3[] comparitors;
		
	}
	

	public class RespRate<T1, T2, T3> extends Parameter<T1, T2, T3>{}
	public class SpO2<T1, T2, T3> extends Parameter<T1, T2, T3>{}
	public class InspiredO2<T1, T2, T3> extends Parameter<T1, T2, T3>{	}
	public class Temp<T1, T2, T3> extends Parameter<T1, T2, T3>{}
	public class SistBP<T1, T2, T3> extends Parameter<T1, T2, T3>{}
	public class HeartRate<T1, T2, T3> extends Parameter<T1, T2, T3>{}
	public class AVPU<T1, T2, T3> extends Parameter<T1, T2, T3>{}


	

}

