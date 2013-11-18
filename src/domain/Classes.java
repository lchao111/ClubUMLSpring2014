package domain;

/**
 * 
 * @author Jiayuan Song
 *
 */
public class Classes extends Metrics {
	private int metricsId;
	private int idealNoOfClasses;
	private int maxNoOfClasses;
	private int minNoOfClasses;
	/**
	 * @return the metricsId
	 */
	public int getMetricsId() {
		return metricsId;
	}
	/**
	 * @param metricsId the metricsId to set
	 */
	public void setMetricsId(int metricsId) {
		this.metricsId = metricsId;
	}
	/**
	 * @return the idealNoOfClasses
	 */
	public int getIdealNoOfClasses() {
		return idealNoOfClasses;
	}
	/**
	 * @param idealNoOfClasses the idealNoOfClasses to set
	 */
	public void setIdealNoOfClasses(int idealNoOfClasses) {
		this.idealNoOfClasses = idealNoOfClasses;
	}
	/**
	 * @return the maxNoOfClasses
	 */
	public int getMaxNoOfClasses() {
		return maxNoOfClasses;
	}
	/**
	 * @param maxNoOfClasses the maxNoOfClasses to set
	 */
	public void setMaxNoOfClasses(int maxNoOfClasses) {
		this.maxNoOfClasses = maxNoOfClasses;
	}
	/**
	 * 
	 * @return minNoOfClasses
	 */
	
	public int getMinNoOfClasses(){
		return minNoOfClasses;
	}
	/**
	 * 
	 * @param minNoOfClasses
	 */
	
	public void setMinNoOfClasses(int minNoOfClasses){
		this.minNoOfClasses = minNoOfClasses;
	}
	
	
}
