package p7;

import java.io.Serializable;
public final class w extends x implements Serializable {
    public static final w f53412b = new w(0);
    public static final w f53413c = new w(1);
    public final int f53414a;

    public w(int i3) {
        this.f53414a = i3;
    }

    @Override
    public final x a() {
        switch (this.f53414a) {
            case 0:
                return f53413c;
            default:
                return f53412b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f53414a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f53414a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
