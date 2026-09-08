package z7;
public final class k4 implements ia.d {
    public static final k4 f51169a = new Object();
    public static final ia.c f51170b = new ia.c("maxMs", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51171c = new ia.c("minMs", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51172e = new ia.c("firstQuartileMs", i2.g.n(w.f.k(w.class, new s(4))));
    public static final ia.c f51173f = new ia.c("medianMs", i2.g.n(w.f.k(w.class, new s(5))));
    public static final ia.c f51174g = new ia.c("thirdQuartileMs", i2.g.n(w.f.k(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51170b, maVar.f51199a);
        eVar.a(f51171c, maVar.f51200b);
        eVar.a(d, maVar.f51201c);
        eVar.a(f51172e, maVar.d);
        eVar.a(f51173f, maVar.f51202e);
        eVar.a(f51174g, maVar.f51203f);
    }
}
