package za;
public final class h implements ia.d {
    public static final h f53108a = new Object();
    public static final ia.c f53109b = ia.c.c("sessionId");
    public static final ia.c f53110c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f53111e = ia.c.c("eventTimestampUs");
    public static final ia.c f53112f = ia.c.c("dataCollectionStatus");
    public static final ia.c f53113g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53109b, j0Var.f53126a);
        eVar.a(f53110c, j0Var.f53127b);
        eVar.e(d, j0Var.f53128c);
        eVar.f(f53111e, j0Var.d);
        eVar.a(f53112f, j0Var.f53129e);
        eVar.a(f53113g, j0Var.f53130f);
    }
}
