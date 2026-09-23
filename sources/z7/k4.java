package z7;
public final class k4 implements ia.d {
    public static final k4 f48462a = new Object();
    public static final ia.c f48463b = new ia.c("maxMs", hg.c.o(w.c.l(w.class, new s(1))));
    public static final ia.c f48464c = new ia.c("minMs", hg.c.o(w.c.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.o(w.c.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.o(w.c.l(w.class, new s(4))));
    public static final ia.c f48465f = new ia.c("medianMs", hg.c.o(w.c.l(w.class, new s(5))));
    public static final ia.c f48466g = new ia.c("thirdQuartileMs", hg.c.o(w.c.l(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48463b, maVar.f48490a);
        eVar.a(f48464c, maVar.f48491b);
        eVar.a(d, maVar.f48492c);
        eVar.a(e, maVar.d);
        eVar.a(f48465f, maVar.e);
        eVar.a(f48466g, maVar.f48493f);
    }
}
