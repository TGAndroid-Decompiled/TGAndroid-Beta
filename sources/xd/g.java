package xd;
public final class g {
    public final d f50554a;
    public final k f50555b = new k(0.0f);
    public final k f50556c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f50557e = new k(0.0f);
    public final k f50558f = new k(0.0f);
    public final k f50559g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f50554a = dVar;
    }

    public static void a(g gVar, int i10, boolean z4) {
        k kVar = gVar.f50556c;
        k kVar2 = gVar.f50555b;
        float f10 = 0.0f;
        if (z4) {
            kVar2.f50568c = i10;
            if (i10 > 0) {
                f10 = 1.0f;
            }
            kVar.f50568c = f10;
            return;
        }
        kVar2.d(i10);
        if (i10 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
