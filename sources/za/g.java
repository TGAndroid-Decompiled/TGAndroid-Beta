package za;
public final class g implements ia.d {
    public static final g f54220a = new Object();
    public static final ia.c f54221b = ia.c.c("eventType");
    public static final ia.c f54222c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        ia.e eVar = (ia.e) obj2;
        c0Var.getClass();
        eVar.a(f54221b, l.SESSION_START);
        eVar.a(f54222c, c0Var.f54200a);
        eVar.a(d, c0Var.f54201b);
    }
}
