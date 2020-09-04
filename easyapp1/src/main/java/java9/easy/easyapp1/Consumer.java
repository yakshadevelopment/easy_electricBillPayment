package java9.easy.easyapp1;


import java.text.DecimalFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consumer {
	private String id;
	private String name;
	private Integer unitConsumed;
	private String finalPayment;
	public Consumer(String id, String name, Integer unitConsumed) {
		super();
		this.id = id;
		this.name = name;
		this.unitConsumed = unitConsumed;
	}
	@Override
	public String toString() {
		String output=String.format("%-5s %-20s %-10s %-10s",id,name,unitConsumed,finalPayment);
		return output;
	}

}
