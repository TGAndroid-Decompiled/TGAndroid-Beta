package z7;
public final class k4 implements ja.d {
    public static final k4 f51071a = new Object();
    public static final ja.c f51072b = new ja.c("maxMs", i2.d.o(r4.c.n(w.class, new s(1))));
    public static final ja.c f51073c = new ja.c("minMs", i2.d.o(r4.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i2.d.o(r4.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.d.o(r4.c.n(w.class, new s(4))));
    public static final ja.c f51074f = new ja.c("medianMs", i2.d.o(r4.c.n(w.class, new s(5))));
    public static final ja.c f51075g = new ja.c("thirdQuartileMs", i2.d.o(r4.c.n(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f51072b, maVar.f51101a);
        eVar.d(f51073c, maVar.f51102b);
        eVar.d(d, maVar.f51103c);
        eVar.d(e, maVar.d);
        eVar.d(f51074f, maVar.e);
        eVar.d(f51075g, maVar.f51104f);
    }
}
