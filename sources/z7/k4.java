package z7;
public final class k4 implements ia.d {
    public static final k4 f48839a = new Object();
    public static final ia.c f48840b = new ia.c("maxMs", hg.k0.n(v7.j0.l(w.class, new s(1))));
    public static final ia.c f48841c = new ia.c("minMs", hg.k0.n(v7.j0.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.n(v7.j0.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.n(v7.j0.l(w.class, new s(4))));
    public static final ia.c f48842f = new ia.c("medianMs", hg.k0.n(v7.j0.l(w.class, new s(5))));
    public static final ia.c f48843g = new ia.c("thirdQuartileMs", hg.k0.n(v7.j0.l(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48840b, maVar.f48867a);
        eVar.a(f48841c, maVar.f48868b);
        eVar.a(d, maVar.f48869c);
        eVar.a(e, maVar.d);
        eVar.a(f48842f, maVar.e);
        eVar.a(f48843g, maVar.f48870f);
    }
}
