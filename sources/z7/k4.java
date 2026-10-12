package z7;
public final class k4 implements ia.d {
    public static final k4 f54177a = new Object();
    public static final ia.c f54178b = new ia.c("maxMs", hg.c.o(sc.v.o(w.class, new s(1))));
    public static final ia.c f54179c = new ia.c("minMs", hg.c.o(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.o(sc.v.o(w.class, new s(3))));
    public static final ia.c f54180e = new ia.c("firstQuartileMs", hg.c.o(sc.v.o(w.class, new s(4))));
    public static final ia.c f54181f = new ia.c("medianMs", hg.c.o(sc.v.o(w.class, new s(5))));
    public static final ia.c f54182g = new ia.c("thirdQuartileMs", hg.c.o(sc.v.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54178b, maVar.f54210a);
        eVar.a(f54179c, maVar.f54211b);
        eVar.a(d, maVar.f54212c);
        eVar.a(f54180e, maVar.d);
        eVar.a(f54181f, maVar.f54213e);
        eVar.a(f54182g, maVar.f54214f);
    }
}
