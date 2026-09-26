package z7;
public final class k4 implements ia.d {
    public static final k4 f48790a = new Object();
    public static final ia.c f48791b = new ia.c("maxMs", hg.c.m(v7.j.m(w.class, new s(1))));
    public static final ia.c f48792c = new ia.c("minMs", hg.c.m(v7.j.m(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(v7.j.m(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.m(v7.j.m(w.class, new s(4))));
    public static final ia.c f48793f = new ia.c("medianMs", hg.c.m(v7.j.m(w.class, new s(5))));
    public static final ia.c f48794g = new ia.c("thirdQuartileMs", hg.c.m(v7.j.m(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48791b, maVar.f48818a);
        eVar.a(f48792c, maVar.f48819b);
        eVar.a(d, maVar.f48820c);
        eVar.a(e, maVar.d);
        eVar.a(f48793f, maVar.e);
        eVar.a(f48794g, maVar.f48821f);
    }
}
