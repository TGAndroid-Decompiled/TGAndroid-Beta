package y9;
public final class l implements ia.d {
    public static final l f49816a = new Object();
    public static final ia.c f49817b = ia.c.c("baseAddress");
    public static final ia.c f49818c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c f49819e = ia.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f49817b, o0Var.f49848a);
        eVar.f(f49818c, o0Var.f49849b);
        eVar.a(d, o0Var.f49850c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f49746a);
        } else {
            bArr = null;
        }
        eVar.a(f49819e, bArr);
    }
}
