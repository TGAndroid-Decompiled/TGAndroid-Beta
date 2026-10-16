package z7;
public final class k4 implements ja.d {
    public static final k4 f49688a = new Object();
    public static final ja.c f49689b = new ja.c("maxMs", i2.d.o(t8.b.n(w.class, new s(1))));
    public static final ja.c f49690c = new ja.c("minMs", i2.d.o(t8.b.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i2.d.o(t8.b.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.d.o(t8.b.n(w.class, new s(4))));
    public static final ja.c f49691f = new ja.c("medianMs", i2.d.o(t8.b.n(w.class, new s(5))));
    public static final ja.c f49692g = new ja.c("thirdQuartileMs", i2.d.o(t8.b.n(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49689b, maVar.f49718a);
        eVar.d(f49690c, maVar.f49719b);
        eVar.d(d, maVar.f49720c);
        eVar.d(e, maVar.d);
        eVar.d(f49691f, maVar.e);
        eVar.d(f49692g, maVar.f49721f);
    }
}
