package q7;

import java.io.Serializable;
public final class v extends w implements Serializable {
    public static final v f56062b = new v(0);
    public static final v f56063c = new v(1);
    public final int f56064a;

    public v(int i7) {
        this.f56064a = i7;
    }

    @Override
    public final w a() {
        switch (this.f56064a) {
            case 0:
                return f56063c;
            default:
                return f56062b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f56064a) {
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
        switch (this.f56064a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
