package y9;
public final class l implements ia.d {
    public static final l f52080a = new Object();
    public static final ia.c f52081b = ia.c.c("baseAddress");
    public static final ia.c f52082c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f52083e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f52081b, o0Var.f52112a);
        eVar.f(f52082c, o0Var.f52113b);
        eVar.a(d, o0Var.f52114c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f52010a);
        } else {
            bArr = null;
        }
        eVar.a(f52083e, bArr);
    }
}
