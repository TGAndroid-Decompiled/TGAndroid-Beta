package xd;
public final class g {
    public final d f50518a;
    public final k f50519b = new k(0.0f);
    public final k f50520c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f50521e = new k(0.0f);
    public final k f50522f = new k(0.0f);
    public final k f50523g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f50518a = dVar;
    }

    public static void a(g gVar, int i10, boolean z4) {
        k kVar = gVar.f50520c;
        k kVar2 = gVar.f50519b;
        float f10 = 0.0f;
        if (z4) {
            kVar2.f50532c = i10;
            if (i10 > 0) {
                f10 = 1.0f;
            }
            kVar.f50532c = f10;
            return;
        }
        kVar2.d(i10);
        if (i10 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
