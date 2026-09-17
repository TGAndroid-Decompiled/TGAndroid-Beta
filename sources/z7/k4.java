package z7;
public final class k4 implements ia.d {
    public static final k4 f51139a = new Object();
    public static final ia.c f51140b = new ia.c("maxMs", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51141c = new ia.c("minMs", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51142e = new ia.c("firstQuartileMs", i2.g.n(w.f.k(w.class, new s(4))));
    public static final ia.c f51143f = new ia.c("medianMs", i2.g.n(w.f.k(w.class, new s(5))));
    public static final ia.c f51144g = new ia.c("thirdQuartileMs", i2.g.n(w.f.k(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51140b, maVar.f51169a);
        eVar.a(f51141c, maVar.f51170b);
        eVar.a(d, maVar.f51171c);
        eVar.a(f51142e, maVar.d);
        eVar.a(f51143f, maVar.f51172e);
        eVar.a(f51144g, maVar.f51173f);
    }
}
