package za;
public final class h implements ia.d {
    public static final h f48779a = new Object();
    public static final ia.c f48780b = ia.c.c("sessionId");
    public static final ia.c f48781c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f48782f = ia.c.c("dataCollectionStatus");
    public static final ia.c f48783g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48780b, j0Var.f48794a);
        eVar.a(f48781c, j0Var.f48795b);
        eVar.e(d, j0Var.f48796c);
        eVar.f(e, j0Var.d);
        eVar.a(f48782f, j0Var.e);
        eVar.a(f48783g, j0Var.f48797f);
    }
}
