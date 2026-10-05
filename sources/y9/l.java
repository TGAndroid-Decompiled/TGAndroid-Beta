package y9;
public final class l implements ia.d {
    public static final l f50712a = new Object();
    public static final ia.c f50713b = ia.c.c("baseAddress");
    public static final ia.c f50714c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f50715e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f50713b, o0Var.f50744a);
        eVar.f(f50714c, o0Var.f50745b);
        eVar.a(d, o0Var.f50746c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f50642a);
        } else {
            bArr = null;
        }
        eVar.a(f50715e, bArr);
    }
}
