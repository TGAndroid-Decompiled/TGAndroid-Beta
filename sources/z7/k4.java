package z7;
public final class k4 implements ia.d {
    public static final k4 f47635a = new Object();
    public static final ia.c f47636b = new ia.c("maxMs", hc.b.p(w.f.k(w.class, new s(1))));
    public static final ia.c f47637c = new ia.c("minMs", hc.b.p(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hc.b.p(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hc.b.p(w.f.k(w.class, new s(4))));
    public static final ia.c f47638f = new ia.c("medianMs", hc.b.p(w.f.k(w.class, new s(5))));
    public static final ia.c f47639g = new ia.c("thirdQuartileMs", hc.b.p(w.f.k(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f47636b, maVar.f47663a);
        eVar.a(f47637c, maVar.f47664b);
        eVar.a(d, maVar.f47665c);
        eVar.a(e, maVar.d);
        eVar.a(f47638f, maVar.e);
        eVar.a(f47639g, maVar.f47666f);
    }
}
