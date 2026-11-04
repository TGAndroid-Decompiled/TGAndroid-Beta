package x7;
public abstract class n6 {
    public static yd.c a(int i3, yd.a aVar, int i10) {
        if ((i10 & 2) != 0) {
            aVar = yd.a.f59374a;
        }
        if (i3 != -2) {
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 != Integer.MAX_VALUE) {
                        if (aVar == yd.a.f59374a) {
                            return new yd.c(i3);
                        }
                        return new yd.m(i3, aVar);
                    }
                    return new yd.c(Integer.MAX_VALUE);
                } else if (aVar == yd.a.f59374a) {
                    return new yd.c(0);
                } else {
                    return new yd.m(1, aVar);
                }
            } else if (aVar == yd.a.f59374a) {
                return new yd.m(1, yd.a.f59375b);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else if (aVar == yd.a.f59374a) {
            yd.g.D.getClass();
            return new yd.c(yd.f.f59407b);
        } else {
            return new yd.m(1, aVar);
        }
    }
}
