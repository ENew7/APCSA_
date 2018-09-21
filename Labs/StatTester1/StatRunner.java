 


/**
 * Lab 906::Find Mean Median and Mode
 * 
 * @author Ed 
 * @version (a version number or a date)
 */
public class StatRunner{
    
    
    public static void main(){
        StatTester st = new StatTester();
        st.loadArray();
        st.printArray();
        int sum = st.getSum();
        double mean = st.getMean();
        double median = st.getMedian();
        
        int mode = st.getMode();
        System.out.println("sum= " + sum);
        System.out.println("mean= " + mean);
        System.out.println("median= " + median);
        System.out.println("mode= " + mode);
    }
}