package y9;
public final class l implements ia.d {
    public static final l f46825a = new Object();
    public static final ia.c f46826b = ia.c.c("baseAddress");
    public static final ia.c f46827c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f46826b, o0Var.f46851a);
        eVar.f(f46827c, o0Var.f46852b);
        eVar.a(d, o0Var.f46853c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f46763a);
        } else {
            bArr = null;
        }
        eVar.a(e, bArr);
    }
}
