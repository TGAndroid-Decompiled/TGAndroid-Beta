package z7;
public final class k4 implements ia.d {
    public static final k4 f51138a = new Object();
    public static final ia.c f51139b = new ia.c("maxMs", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51140c = new ia.c("minMs", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51141e = new ia.c("firstQuartileMs", i2.g.n(w.f.k(w.class, new s(4))));
    public static final ia.c f51142f = new ia.c("medianMs", i2.g.n(w.f.k(w.class, new s(5))));
    public static final ia.c f51143g = new ia.c("thirdQuartileMs", i2.g.n(w.f.k(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51139b, maVar.f51168a);
        eVar.a(f51140c, maVar.f51169b);
        eVar.a(d, maVar.f51170c);
        eVar.a(f51141e, maVar.d);
        eVar.a(f51142f, maVar.f51171e);
        eVar.a(f51143g, maVar.f51172f);
    }
}
