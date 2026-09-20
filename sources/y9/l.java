package y9;
public final class l implements ia.d {
    public static final l f46872a = new Object();
    public static final ia.c f46873b = ia.c.c("baseAddress");
    public static final ia.c f46874c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f46873b, o0Var.f46898a);
        eVar.f(f46874c, o0Var.f46899b);
        eVar.a(d, o0Var.f46900c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f46810a);
        } else {
            bArr = null;
        }
        eVar.a(e, bArr);
    }
}
