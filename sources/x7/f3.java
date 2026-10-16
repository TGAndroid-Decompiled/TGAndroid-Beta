package x7;
public final class f3 implements ja.d {
    public static final f3 f47979a = new Object();
    public static final ja.c f47980b = new ja.c("maxMs", i2.d.o(t8.b.m(c0.class, new z(1))));
    public static final ja.c f47981c = new ja.c("minMs", i2.d.o(t8.b.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("avgMs", i2.d.o(t8.b.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.d.o(t8.b.m(c0.class, new z(4))));
    public static final ja.c f47982f = new ja.c("medianMs", i2.d.o(t8.b.m(c0.class, new z(5))));
    public static final ja.c f47983g = new ja.c("thirdQuartileMs", i2.d.o(t8.b.m(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f47980b, a7Var.f47930a);
        eVar.d(f47981c, a7Var.f47931b);
        eVar.d(d, a7Var.f47932c);
        eVar.d(e, a7Var.d);
        eVar.d(f47982f, a7Var.e);
        eVar.d(f47983g, a7Var.f47933f);
    }
}
