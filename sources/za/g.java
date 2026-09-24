package za;
public final class g implements ia.d {
    public static final g f49035a = new Object();
    public static final ia.c f49036b = ia.c.c("eventType");
    public static final ia.c f49037c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        ia.e eVar = (ia.e) obj2;
        c0Var.getClass();
        eVar.a(f49036b, l.SESSION_START);
        eVar.a(f49037c, c0Var.f49017a);
        eVar.a(d, c0Var.f49018b);
    }
}
