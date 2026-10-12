package z7;
public final class k4 implements ja.d {
    public static final k4 f49689a = new Object();
    public static final ja.c f49690b = new ja.c("maxMs", i2.d.n(t8.b.n(w.class, new s(1))));
    public static final ja.c f49691c = new ja.c("minMs", i2.d.n(t8.b.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i2.d.n(t8.b.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.d.n(t8.b.n(w.class, new s(4))));
    public static final ja.c f49692f = new ja.c("medianMs", i2.d.n(t8.b.n(w.class, new s(5))));
    public static final ja.c f49693g = new ja.c("thirdQuartileMs", i2.d.n(t8.b.n(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49690b, maVar.f49717a);
        eVar.d(f49691c, maVar.f49718b);
        eVar.d(d, maVar.f49719c);
        eVar.d(e, maVar.d);
        eVar.d(f49692f, maVar.e);
        eVar.d(f49693g, maVar.f49720f);
    }
}
