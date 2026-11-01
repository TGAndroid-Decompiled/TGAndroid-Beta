package x7;
public final class k3 implements ja.d {
    public static final k3 f53238a = new Object();
    public static final ja.c f53239b = new ja.c("imageFormat", i0.a.o(sc.e.m(c0.class, new z(1))));
    public static final ja.c f53240c = new ja.c("originalImageSize", i0.a.o(sc.e.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("compressedImageSize", i0.a.o(sc.e.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("isOdmlImage", i0.a.o(sc.e.m(c0.class, new z(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        e7 e7Var = (e7) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f53239b, e7Var.f53155a);
        eVar.d(f53240c, e7Var.f53156b);
        eVar.d(d, null);
        eVar.d(e, null);
    }
}
