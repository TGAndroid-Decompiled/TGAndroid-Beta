package xf;

import java.util.Arrays;
import java.util.List;
public abstract class l extends m {
    public static final List f49266b = Arrays.asList(new Object(), new Object(), new Object(), new Object(), new Object());

    public static l p(int i9) {
        List list = f49266b;
        if (i9 >= 0 && i9 <= list.size()) {
            return (l) list.get(i9);
        }
        StringBuilder sb2 = new StringBuilder("Shape type must be in range from 0 to ");
        sb2.append(list.size() - 1);
        sb2.append(", but got ");
        sb2.append(i9);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override
    public final float a() {
        return 1.0f;
    }

    @Override
    public final String i(int i9) {
        if (i9 != 0 && i9 != 1) {
            if (i9 != 2) {
                return null;
            }
            return "brush";
        }
        return "shape";
    }

    public abstract int m();

    public abstract String n();

    public abstract int o();
}
