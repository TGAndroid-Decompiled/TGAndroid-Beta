package x7;
public final class k3 implements ia.d {
    public static final k3 f44823a = new Object();
    public static final ia.c f44824b = new ia.c("imageFormat", hc.b.p(w.f.j(c0.class, new z(1))));
    public static final ia.c f44825c = new ia.c("originalImageSize", hc.b.p(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hc.b.p(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hc.b.p(w.f.j(c0.class, new z(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        e7 e7Var = (e7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f44824b, e7Var.f44746a);
        eVar.a(f44825c, e7Var.f44747b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
