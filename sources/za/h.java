package za;
public final class h implements ia.d {
    public static final h f54231a = new Object();
    public static final ia.c f54232b = ia.c.c("sessionId");
    public static final ia.c f54233c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f54234e = ia.c.c("eventTimestampUs");
    public static final ia.c f54235f = ia.c.c("dataCollectionStatus");
    public static final ia.c f54236g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54232b, l0Var.f54262a);
        eVar.a(f54233c, l0Var.f54263b);
        eVar.e(d, l0Var.f54264c);
        eVar.f(f54234e, l0Var.d);
        eVar.a(f54235f, l0Var.f54265e);
        eVar.a(f54236g, l0Var.f54266f);
    }
}
