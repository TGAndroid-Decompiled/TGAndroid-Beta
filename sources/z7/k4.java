package z7;
public final class k4 implements ia.d {
    public static final k4 f48519a = new Object();
    public static final ia.c f48520b = new ia.c("maxMs", hg.k0.o(w.f.k(w.class, new s(1))));
    public static final ia.c f48521c = new ia.c("minMs", hg.k0.o(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.o(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.o(w.f.k(w.class, new s(4))));
    public static final ia.c f48522f = new ia.c("medianMs", hg.k0.o(w.f.k(w.class, new s(5))));
    public static final ia.c f48523g = new ia.c("thirdQuartileMs", hg.k0.o(w.f.k(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48520b, maVar.f48547a);
        eVar.a(f48521c, maVar.f48548b);
        eVar.a(d, maVar.f48549c);
        eVar.a(e, maVar.d);
        eVar.a(f48522f, maVar.e);
        eVar.a(f48523g, maVar.f48550f);
    }
}
