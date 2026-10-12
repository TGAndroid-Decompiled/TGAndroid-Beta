package y9;
public final class l implements ia.d {
    public static final l f52217a = new Object();
    public static final ia.c f52218b = ia.c.c("baseAddress");
    public static final ia.c f52219c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f52220e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f52218b, o0Var.f52249a);
        eVar.f(f52219c, o0Var.f52250b);
        eVar.a(d, o0Var.f52251c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f52147a);
        } else {
            bArr = null;
        }
        eVar.a(f52220e, bArr);
    }
}
