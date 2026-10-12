package z7;
public final class c8 implements ia.d {
    public static final c8 f53838a = new Object();
    public static final ia.c f53839b = new ia.c("inferenceCommonLogEvent", hg.c.o(sc.v.o(w.class, new s(1))));
    public static final ia.c f53840c = new ia.c("imageInfo", hg.c.o(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("subjectSegmenterOptions", hg.c.o(sc.v.o(w.class, new s(3))));
    public static final ia.c f53841e = new ia.c("subjectInfos", hg.c.o(sc.v.o(w.class, new s(4))));
    public static final ia.c f53842f = new ia.c("qualityScores", hg.c.o(sc.v.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        fe feVar = (fe) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53839b, feVar.f53892a);
        eVar.a(f53840c, feVar.f53893b);
        eVar.a(d, feVar.f53894c);
        eVar.a(f53841e, feVar.d);
        eVar.a(f53842f, feVar.f53895e);
    }
}
