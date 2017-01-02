package factory.variables;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by dziadziasmerf on 28.12.16.
 */
@Getter
@Setter
public class IntVariable extends Variable {

    private int value;

    public IntVariable(String name) {
        super(name);
    }

    public IntVariable(String name, int value) {
        super(name);
        setValue(value);
    }

}
