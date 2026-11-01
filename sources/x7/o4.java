package x7;
public final class o4 implements ja.d {
    public static final o4 f53288a = new Object();
    public static final ja.c f53289b = new ja.c("detectorOptions", i0.a.o(sc.e.m(c0.class, new z(1))));
    public static final ja.c f53290c = new ja.c("errorCodes", i0.a.o(sc.e.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("totalInitializationMs", i0.a.o(sc.e.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("loggingInitializationMs", i0.a.o(sc.e.m(c0.class, new z(4))));
    public static final ja.c f53291f = new ja.c("otherErrors", i0.a.o(sc.e.m(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        h8 h8Var = (h8) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f53289b, h8Var.f53200a);
        eVar.d(f53290c, h8Var.f53201b);
        eVar.d(d, null);
        eVar.d(e, null);
        eVar.d(f53291f, null);
    }
}
