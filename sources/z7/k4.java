package z7;
public final class k4 implements ja.d {
    public static final k4 f55010a = new Object();
    public static final ja.c f55011b = new ja.c("maxMs", i0.a.o(sc.e.n(w.class, new s(1))));
    public static final ja.c f55012c = new ja.c("minMs", i0.a.o(sc.e.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i0.a.o(sc.e.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i0.a.o(sc.e.n(w.class, new s(4))));
    public static final ja.c f55013f = new ja.c("medianMs", i0.a.o(sc.e.n(w.class, new s(5))));
    public static final ja.c f55014g = new ja.c("thirdQuartileMs", i0.a.o(sc.e.n(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f55011b, maVar.f55040a);
        eVar.d(f55012c, maVar.f55041b);
        eVar.d(d, maVar.f55042c);
        eVar.d(e, maVar.d);
        eVar.d(f55013f, maVar.e);
        eVar.d(f55014g, maVar.f55043f);
    }
}
