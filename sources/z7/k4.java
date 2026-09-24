package z7;
public final class k4 implements ia.d {
    public static final k4 f48779a = new Object();
    public static final ia.c f48780b = new ia.c("maxMs", hg.c.m(v7.j.m(w.class, new s(1))));
    public static final ia.c f48781c = new ia.c("minMs", hg.c.m(v7.j.m(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(v7.j.m(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.m(v7.j.m(w.class, new s(4))));
    public static final ia.c f48782f = new ia.c("medianMs", hg.c.m(v7.j.m(w.class, new s(5))));
    public static final ia.c f48783g = new ia.c("thirdQuartileMs", hg.c.m(v7.j.m(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48780b, maVar.f48807a);
        eVar.a(f48781c, maVar.f48808b);
        eVar.a(d, maVar.f48809c);
        eVar.a(e, maVar.d);
        eVar.a(f48782f, maVar.e);
        eVar.a(f48783g, maVar.f48810f);
    }
}
