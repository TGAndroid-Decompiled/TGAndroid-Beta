package y9;
public final class l implements ia.d {
    public static final l f46894a = new Object();
    public static final ia.c f46895b = ia.c.c("baseAddress");
    public static final ia.c f46896c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f46895b, o0Var.f46920a);
        eVar.f(f46896c, o0Var.f46921b);
        eVar.a(d, o0Var.f46922c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f46832a);
        } else {
            bArr = null;
        }
        eVar.a(e, bArr);
    }
}
