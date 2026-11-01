package x7;
public final class f3 implements ja.d {
    public static final f3 f53162a = new Object();
    public static final ja.c f53163b = new ja.c("maxMs", i0.a.o(sc.e.m(c0.class, new z(1))));
    public static final ja.c f53164c = new ja.c("minMs", i0.a.o(sc.e.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("avgMs", i0.a.o(sc.e.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i0.a.o(sc.e.m(c0.class, new z(4))));
    public static final ja.c f53165f = new ja.c("medianMs", i0.a.o(sc.e.m(c0.class, new z(5))));
    public static final ja.c f53166g = new ja.c("thirdQuartileMs", i0.a.o(sc.e.m(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f53163b, a7Var.f53113a);
        eVar.d(f53164c, a7Var.f53114b);
        eVar.d(d, a7Var.f53115c);
        eVar.d(e, a7Var.d);
        eVar.d(f53165f, a7Var.e);
        eVar.d(f53166g, a7Var.f53116f);
    }
}
