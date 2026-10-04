package za;
public final class g implements ia.d {
    public static final g f53099a = new Object();
    public static final ia.c f53100b = ia.c.c("eventType");
    public static final ia.c f53101c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ia.e eVar = (ia.e) obj2;
        a0Var.getClass();
        eVar.a(f53100b, k.SESSION_START);
        eVar.a(f53101c, a0Var.f53060a);
        eVar.a(d, a0Var.f53061b);
    }
}
