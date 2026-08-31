package xd;
public final class g {
    public final d f50517a;
    public final k f50518b = new k(0.0f);
    public final k f50519c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f50520e = new k(0.0f);
    public final k f50521f = new k(0.0f);
    public final k f50522g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f50517a = dVar;
    }

    public static void a(g gVar, int i10, boolean z4) {
        k kVar = gVar.f50519c;
        k kVar2 = gVar.f50518b;
        float f10 = 0.0f;
        if (z4) {
            kVar2.f50531c = i10;
            if (i10 > 0) {
                f10 = 1.0f;
            }
            kVar.f50531c = f10;
            return;
        }
        kVar2.d(i10);
        if (i10 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
