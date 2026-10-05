package z7;
public final class k4 implements ia.d {
    public static final k4 f52837a = new Object();
    public static final ia.c f52838b = new ia.c("maxMs", hg.c.m(sa.e.o(w.class, new s(1))));
    public static final ia.c f52839c = new ia.c("minMs", hg.c.m(sa.e.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sa.e.o(w.class, new s(3))));
    public static final ia.c f52840e = new ia.c("firstQuartileMs", hg.c.m(sa.e.o(w.class, new s(4))));
    public static final ia.c f52841f = new ia.c("medianMs", hg.c.m(sa.e.o(w.class, new s(5))));
    public static final ia.c f52842g = new ia.c("thirdQuartileMs", hg.c.m(sa.e.o(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f52838b, maVar.f52867a);
        eVar.a(f52839c, maVar.f52868b);
        eVar.a(d, maVar.f52869c);
        eVar.a(f52840e, maVar.d);
        eVar.a(f52841f, maVar.f52870e);
        eVar.a(f52842g, maVar.f52871f);
    }
}
