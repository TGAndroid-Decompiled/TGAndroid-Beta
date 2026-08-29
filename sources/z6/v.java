package z6;

import java.io.Serializable;
public final class v extends w implements Serializable {
    public static final v f50765b = new v(0);
    public static final v f50766c = new v(1);
    public final int f50767a;

    public v(int i10) {
        this.f50767a = i10;
    }

    @Override
    public final w a() {
        switch (this.f50767a) {
            case 0:
                return f50766c;
            default:
                return f50765b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f50767a) {
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
        switch (this.f50767a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
