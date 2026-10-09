package za;
public final class g implements ia.d {
    public static final g f54222a = new Object();
    public static final ia.c f54223b = ia.c.c("eventType");
    public static final ia.c f54224c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        ia.e eVar = (ia.e) obj2;
        c0Var.getClass();
        eVar.a(f54223b, l.SESSION_START);
        eVar.a(f54224c, c0Var.f54202a);
        eVar.a(d, c0Var.f54203b);
    }
}
