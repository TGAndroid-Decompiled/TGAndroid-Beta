package y9;
public final class l implements ia.d {
    public static final l f50705a = new Object();
    public static final ia.c f50706b = ia.c.c("baseAddress");
    public static final ia.c f50707c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f50708e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f50706b, o0Var.f50737a);
        eVar.f(f50707c, o0Var.f50738b);
        eVar.a(d, o0Var.f50739c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f50635a);
        } else {
            bArr = null;
        }
        eVar.a(f50708e, bArr);
    }
}
