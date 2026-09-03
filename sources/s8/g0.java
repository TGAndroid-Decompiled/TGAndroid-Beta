package s8;

import java.io.Serializable;
public final class g0 extends h0 implements Serializable {
    public static final g0 f44191b = new g0(0);
    public static final g0 f44192c = new g0(1);
    public final int f44193a;

    public g0(int i10) {
        this.f44193a = i10;
    }

    @Override
    public final h0 a() {
        switch (this.f44193a) {
            case 0:
                return f44192c;
            default:
                return f44191b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f44193a) {
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
        switch (this.f44193a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
