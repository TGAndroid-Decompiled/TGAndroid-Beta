package xd;
public final class g {
    public final d f46903a;
    public final k f46904b = new k(0.0f);
    public final k f46905c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k e = new k(0.0f);
    public final k f46906f = new k(0.0f);
    public final k f46907g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f46903a = dVar;
    }

    public static void a(g gVar, int i10, boolean z4) {
        k kVar = gVar.f46905c;
        k kVar2 = gVar.f46904b;
        float f10 = 0.0f;
        if (z4) {
            kVar2.f46915c = i10;
            if (i10 > 0) {
                f10 = 1.0f;
            }
            kVar.f46915c = f10;
            return;
        }
        kVar2.d(i10);
        if (i10 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
