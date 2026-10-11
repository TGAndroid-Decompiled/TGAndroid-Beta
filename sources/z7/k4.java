package z7;
public final class k4 implements ia.d {
    public static final k4 f54032a = new Object();
    public static final ia.c f54033b = new ia.c("maxMs", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54034c = new ia.c("minMs", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54035e = new ia.c("firstQuartileMs", hg.c.m(sc.v.o(w.class, new s(4))));
    public static final ia.c f54036f = new ia.c("medianMs", hg.c.m(sc.v.o(w.class, new s(5))));
    public static final ia.c f54037g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54033b, maVar.f54065a);
        eVar.a(f54034c, maVar.f54066b);
        eVar.a(d, maVar.f54067c);
        eVar.a(f54035e, maVar.d);
        eVar.a(f54036f, maVar.f54068e);
        eVar.a(f54037g, maVar.f54069f);
    }
}
