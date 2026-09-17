package za;
public final class h implements ia.d {
    public static final h f51431a = new Object();
    public static final ia.c f51432b = ia.c.c("sessionId");
    public static final ia.c f51433c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f51434e = ia.c.c("eventTimestampUs");
    public static final ia.c f51435f = ia.c.c("dataCollectionStatus");
    public static final ia.c f51436g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51432b, j0Var.f51449a);
        eVar.a(f51433c, j0Var.f51450b);
        eVar.e(d, j0Var.f51451c);
        eVar.f(f51434e, j0Var.d);
        eVar.a(f51435f, j0Var.f51452e);
        eVar.a(f51436g, j0Var.f51453f);
    }
}
