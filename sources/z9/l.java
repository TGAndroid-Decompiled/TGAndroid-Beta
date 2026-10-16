package z9;
public final class l implements ja.d {
    public static final l f50031a = new Object();
    public static final ja.c f50032b = ja.c.c("baseAddress");
    public static final ja.c f50033c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f50032b, o0Var.f50057a);
        eVar.f(f50033c, o0Var.f50058b);
        eVar.d(d, o0Var.f50059c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f49969a);
        } else {
            bArr = null;
        }
        eVar.d(e, bArr);
    }
}
