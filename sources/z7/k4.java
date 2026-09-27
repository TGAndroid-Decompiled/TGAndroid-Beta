package z7;
public final class k4 implements ia.d {
    public static final k4 f48834a = new Object();
    public static final ia.c f48835b = new ia.c("maxMs", hg.k0.n(v7.k0.l(w.class, new s(1))));
    public static final ia.c f48836c = new ia.c("minMs", hg.k0.n(v7.k0.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.n(v7.k0.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.n(v7.k0.l(w.class, new s(4))));
    public static final ia.c f48837f = new ia.c("medianMs", hg.k0.n(v7.k0.l(w.class, new s(5))));
    public static final ia.c f48838g = new ia.c("thirdQuartileMs", hg.k0.n(v7.k0.l(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48835b, maVar.f48862a);
        eVar.a(f48836c, maVar.f48863b);
        eVar.a(d, maVar.f48864c);
        eVar.a(e, maVar.d);
        eVar.a(f48837f, maVar.e);
        eVar.a(f48838g, maVar.f48865f);
    }
}
