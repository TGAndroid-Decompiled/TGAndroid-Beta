package z7;
public final class r4 implements ia.d {
    public static final r4 f54022a = new Object();
    public static final ia.c f54023b = new ia.c("imageFormat", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54024c = new ia.c("originalImageSize", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54025e = new ia.c("isOdmlImage", hg.c.m(sc.v.o(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54023b, raVar.f54030a);
        eVar.a(f54024c, raVar.f54031b);
        eVar.a(d, null);
        eVar.a(f54025e, null);
    }
}
