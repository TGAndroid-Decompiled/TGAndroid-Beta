package z7;
public final class k4 implements ja.d {
    public static final k4 f51078a = new Object();
    public static final ja.c f51079b = new ja.c("maxMs", i2.e.o(r4.c.n(w.class, new s(1))));
    public static final ja.c f51080c = new ja.c("minMs", i2.e.o(r4.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i2.e.o(r4.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.e.o(r4.c.n(w.class, new s(4))));
    public static final ja.c f51081f = new ja.c("medianMs", i2.e.o(r4.c.n(w.class, new s(5))));
    public static final ja.c f51082g = new ja.c("thirdQuartileMs", i2.e.o(r4.c.n(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f51079b, maVar.f51108a);
        eVar.d(f51080c, maVar.f51109b);
        eVar.d(d, maVar.f51110c);
        eVar.d(e, maVar.d);
        eVar.d(f51081f, maVar.e);
        eVar.d(f51082g, maVar.f51111f);
    }
}
