package z9;
public final class l implements ja.d {
    public static final l f51421a = new Object();
    public static final ja.c f51422b = ja.c.c("baseAddress");
    public static final ja.c f51423c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f51422b, o0Var.f51447a);
        eVar.f(f51423c, o0Var.f51448b);
        eVar.d(d, o0Var.f51449c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f51359a);
        } else {
            bArr = null;
        }
        eVar.d(e, bArr);
    }
}
