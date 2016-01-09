package shi.fxsol.uitls;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * 这个增强对象让所有get(key)DescriptiveStatistics时都有值
 * 判断这个map里面是否存在key时,请用containKey(Object)方法
 * @author LiangJingJing
 * @date Dec 5, 2015 10:56:28 PM
 * @param <K>
 * @param <V>
 */
public class EnhancedKeyAlwaysGetDescriptiveStatisticsMap{

	private Map<String,DescriptiveStatistics> map;
	
	public EnhancedKeyAlwaysGetDescriptiveStatisticsMap(){
//		map = new HashMap<String,DescriptiveStatistics>();
		map = new TreeMap<String,DescriptiveStatistics>();
	}

	public void clear() {
		map.clear();
	}

	public boolean containsKey(String key) {
		return map.containsKey(key);
	}

	public boolean containsValue(DescriptiveStatistics value) {
		return map.containsValue(value);
	}

	public Set<java.util.Map.Entry<String,DescriptiveStatistics>> entrySet() {
		return map.entrySet();
	}

	public DescriptiveStatistics get(String key) {
		if(map.get(key)==null){
			DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
			map.put(key, descriptiveStatistics);
		}
		return map.get(key);
	}

	public boolean isEmpty() {
		return map.isEmpty();
	}

	public Set<String> keySet() {
		return map.keySet();
	}

	public DescriptiveStatistics put(String key, DescriptiveStatistics value) {
		return map.put(key, value);
	}

	public void putAll(Map<String,DescriptiveStatistics> m) {
		map.putAll(m);
	}

	public DescriptiveStatistics remove(String key) {
		return map.remove(key);
	}

	public int size() {
		return map.size();
	}

	public Collection<DescriptiveStatistics> values() {
		return map.values();
	}
}
