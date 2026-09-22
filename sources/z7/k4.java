package z7;
public final class k4 implements ia.d {
    public static final k4 f48512a = new Object();
    public static final ia.c f48513b = new ia.c("maxMs", hg.c.o(w.c.l(w.class, new s(1))));
    public static final ia.c f48514c = new ia.c("minMs", hg.c.o(w.c.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.o(w.c.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.o(w.c.l(w.class, new s(4))));
    public static final ia.c f48515f = new ia.c("medianMs", hg.c.o(w.c.l(w.class, new s(5))));
    public static final ia.c f48516g = new ia.c("thirdQuartileMs", hg.c.o(w.c.l(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48513b, maVar.f48540a);
        eVar.a(f48514c, maVar.f48541b);
        eVar.a(d, maVar.f48542c);
        eVar.a(e, maVar.d);
        eVar.a(f48515f, maVar.e);
        eVar.a(f48516g, maVar.f48543f);
    }
}
