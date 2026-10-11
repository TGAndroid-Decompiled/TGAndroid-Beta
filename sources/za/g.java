package za;
public final class g implements ia.d {
    public static final g f54314a = new Object();
    public static final ia.c f54315b = ia.c.c("eventType");
    public static final ia.c f54316c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        ia.e eVar = (ia.e) obj2;
        b0Var.getClass();
        eVar.a(f54315b, l.SESSION_START);
        eVar.a(f54316c, b0Var.f54280a);
        eVar.a(d, b0Var.f54281b);
    }
}
