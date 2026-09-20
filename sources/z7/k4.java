package z7;
public final class k4 implements ia.d {
    public static final k4 f48819a = new Object();
    public static final ia.c f48820b = new ia.c("maxMs", hg.k0.n(v7.j0.l(w.class, new s(1))));
    public static final ia.c f48821c = new ia.c("minMs", hg.k0.n(v7.j0.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.n(v7.j0.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.n(v7.j0.l(w.class, new s(4))));
    public static final ia.c f48822f = new ia.c("medianMs", hg.k0.n(v7.j0.l(w.class, new s(5))));
    public static final ia.c f48823g = new ia.c("thirdQuartileMs", hg.k0.n(v7.j0.l(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48820b, maVar.f48847a);
        eVar.a(f48821c, maVar.f48848b);
        eVar.a(d, maVar.f48849c);
        eVar.a(e, maVar.d);
        eVar.a(f48822f, maVar.e);
        eVar.a(f48823g, maVar.f48850f);
    }
}
