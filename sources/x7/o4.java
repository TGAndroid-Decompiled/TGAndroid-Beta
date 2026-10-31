package x7;
public final class o4 implements ja.d {
    public static final o4 f53270a = new Object();
    public static final ja.c f53271b = new ja.c("detectorOptions", i0.a.o(sc.e.m(c0.class, new z(1))));
    public static final ja.c f53272c = new ja.c("errorCodes", i0.a.o(sc.e.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("totalInitializationMs", i0.a.o(sc.e.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("loggingInitializationMs", i0.a.o(sc.e.m(c0.class, new z(4))));
    public static final ja.c f53273f = new ja.c("otherErrors", i0.a.o(sc.e.m(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        h8 h8Var = (h8) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f53271b, h8Var.f53182a);
        eVar.d(f53272c, h8Var.f53183b);
        eVar.d(d, null);
        eVar.d(e, null);
        eVar.d(f53273f, null);
    }
}
