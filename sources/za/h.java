package za;
public final class h implements ia.d {
    public static final h f54233a = new Object();
    public static final ia.c f54234b = ia.c.c("sessionId");
    public static final ia.c f54235c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f54236e = ia.c.c("eventTimestampUs");
    public static final ia.c f54237f = ia.c.c("dataCollectionStatus");
    public static final ia.c f54238g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54234b, l0Var.f54264a);
        eVar.a(f54235c, l0Var.f54265b);
        eVar.e(d, l0Var.f54266c);
        eVar.f(f54236e, l0Var.d);
        eVar.a(f54237f, l0Var.f54267e);
        eVar.a(f54238g, l0Var.f54268f);
    }
}
