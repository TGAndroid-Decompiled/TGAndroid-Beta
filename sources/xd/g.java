package xd;
public final class g {
    public final d f46971a;
    public final k f46972b = new k(0.0f);
    public final k f46973c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k e = new k(0.0f);
    public final k f46974f = new k(0.0f);
    public final k f46975g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f46971a = dVar;
    }

    public static void a(g gVar, int i10, boolean z4) {
        k kVar = gVar.f46973c;
        k kVar2 = gVar.f46972b;
        float f10 = 0.0f;
        if (z4) {
            kVar2.f46983c = i10;
            if (i10 > 0) {
                f10 = 1.0f;
            }
            kVar.f46983c = f10;
            return;
        }
        kVar2.d(i10);
        if (i10 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
