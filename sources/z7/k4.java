package z7;
public final class k4 implements ja.d {
    public static final k4 f54992a = new Object();
    public static final ja.c f54993b = new ja.c("maxMs", i0.a.o(sc.e.n(w.class, new s(1))));
    public static final ja.c f54994c = new ja.c("minMs", i0.a.o(sc.e.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i0.a.o(sc.e.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i0.a.o(sc.e.n(w.class, new s(4))));
    public static final ja.c f54995f = new ja.c("medianMs", i0.a.o(sc.e.n(w.class, new s(5))));
    public static final ja.c f54996g = new ja.c("thirdQuartileMs", i0.a.o(sc.e.n(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f54993b, maVar.f55022a);
        eVar.d(f54994c, maVar.f55023b);
        eVar.d(d, maVar.f55024c);
        eVar.d(e, maVar.d);
        eVar.d(f54995f, maVar.e);
        eVar.d(f54996g, maVar.f55025f);
    }
}
