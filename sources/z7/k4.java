package z7;
public final class k4 implements ja.d {
    public static final k4 f51086a = new Object();
    public static final ja.c f51087b = new ja.c("maxMs", i0.a.o(r.c.n(w.class, new s(1))));
    public static final ja.c f51088c = new ja.c("minMs", i0.a.o(r.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i0.a.o(r.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i0.a.o(r.c.n(w.class, new s(4))));
    public static final ja.c f51089f = new ja.c("medianMs", i0.a.o(r.c.n(w.class, new s(5))));
    public static final ja.c f51090g = new ja.c("thirdQuartileMs", i0.a.o(r.c.n(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        na naVar = (na) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f51087b, naVar.f51132a);
        eVar.d(f51088c, naVar.f51133b);
        eVar.d(d, naVar.f51134c);
        eVar.d(e, naVar.d);
        eVar.d(f51089f, naVar.e);
        eVar.d(f51090g, naVar.f51135f);
    }
}
