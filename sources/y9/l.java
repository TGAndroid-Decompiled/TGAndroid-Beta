package y9;
public final class l implements ia.d {
    public static final l f50697a = new Object();
    public static final ia.c f50698b = ia.c.c("baseAddress");
    public static final ia.c f50699c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f50700e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f50698b, o0Var.f50729a);
        eVar.f(f50699c, o0Var.f50730b);
        eVar.a(d, o0Var.f50731c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f50627a);
        } else {
            bArr = null;
        }
        eVar.a(f50700e, bArr);
    }
}
