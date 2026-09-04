package za;
public final class h implements ia.d {
    public static final h f51430a = new Object();
    public static final ia.c f51431b = ia.c.c("sessionId");
    public static final ia.c f51432c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f51433e = ia.c.c("eventTimestampUs");
    public static final ia.c f51434f = ia.c.c("dataCollectionStatus");
    public static final ia.c f51435g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51431b, j0Var.f51448a);
        eVar.a(f51432c, j0Var.f51449b);
        eVar.e(d, j0Var.f51450c);
        eVar.f(f51433e, j0Var.d);
        eVar.a(f51434f, j0Var.f51451e);
        eVar.a(f51435g, j0Var.f51452f);
    }
}
