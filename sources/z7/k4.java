package z7;
public final class k4 implements ja.d {
    public static final k4 f51543a = new Object();
    public static final ja.c f51544b = new ja.c("maxMs", i2.o1.p(si.o0.n(w.class, new s(1))));
    public static final ja.c f51545c = new ja.c("minMs", i2.o1.p(si.o0.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i2.o1.p(si.o0.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.o1.p(si.o0.n(w.class, new s(4))));
    public static final ja.c f51546f = new ja.c("medianMs", i2.o1.p(si.o0.n(w.class, new s(5))));
    public static final ja.c f51547g = new ja.c("thirdQuartileMs", i2.o1.p(si.o0.n(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f51544b, maVar.f51573a);
        eVar.d(f51545c, maVar.f51574b);
        eVar.d(d, maVar.f51575c);
        eVar.d(e, maVar.d);
        eVar.d(f51546f, maVar.e);
        eVar.d(f51547g, maVar.f51576f);
    }
}
