package z9;
public final class l implements ja.d {
    public static final l f55351a = new Object();
    public static final ja.c f55352b = ja.c.c("baseAddress");
    public static final ja.c f55353c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(f55352b, o0Var.f55377a);
        eVar.f(f55353c, o0Var.f55378b);
        eVar.d(d, o0Var.f55379c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f55289a);
        } else {
            bArr = null;
        }
        eVar.d(e, bArr);
    }
}
