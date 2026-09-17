package z7;
public final class k4 implements ia.d {
    public static final k4 f51170a = new Object();
    public static final ia.c f51171b = new ia.c("maxMs", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51172c = new ia.c("minMs", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51173e = new ia.c("firstQuartileMs", i2.g.n(w.f.k(w.class, new s(4))));
    public static final ia.c f51174f = new ia.c("medianMs", i2.g.n(w.f.k(w.class, new s(5))));
    public static final ia.c f51175g = new ia.c("thirdQuartileMs", i2.g.n(w.f.k(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51171b, maVar.f51200a);
        eVar.a(f51172c, maVar.f51201b);
        eVar.a(d, maVar.f51202c);
        eVar.a(f51173e, maVar.d);
        eVar.a(f51174f, maVar.f51203e);
        eVar.a(f51175g, maVar.f51204f);
    }
}
