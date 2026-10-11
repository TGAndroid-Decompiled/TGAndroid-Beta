package y9;
public final class l implements ia.d {
    public static final l f52114a = new Object();
    public static final ia.c f52115b = ia.c.c("baseAddress");
    public static final ia.c f52116c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f52117e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f52115b, o0Var.f52146a);
        eVar.f(f52116c, o0Var.f52147b);
        eVar.a(d, o0Var.f52148c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f52044a);
        } else {
            bArr = null;
        }
        eVar.a(f52117e, bArr);
    }
}
