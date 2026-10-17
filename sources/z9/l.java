package z9;
public final class l implements ja.d {
    public static final l f51436a = new Object();
    public static final ja.c f51437b = ja.c.c("baseAddress");
    public static final ja.c f51438c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f51437b, o0Var.f51462a);
        eVar.f(f51438c, o0Var.f51463b);
        eVar.d(d, o0Var.f51464c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f51374a);
        } else {
            bArr = null;
        }
        eVar.d(e, bArr);
    }
}
