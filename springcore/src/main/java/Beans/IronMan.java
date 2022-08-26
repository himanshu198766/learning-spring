package Beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IronMan {

	TonyStark tony;
	int suitNum;
	
	public void suitUp() {
		System.out.println("Suiting Up suit "+getSuitNum() +" currently located in "+ tony.getAddress() );
	}
}
