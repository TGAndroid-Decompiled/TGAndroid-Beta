package te;
public final class g {
    public final d f55513a;
    public final k f55514b = new k(0.0f);
    public final k f55515c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f55516e = new k(0.0f);
    public final k f55517f = new k(0.0f);
    public final k f55518g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f55513a = dVar;
    }

    public static void a(g gVar, int i7, boolean z9) {
        k kVar = gVar.f55515c;
        k kVar2 = gVar.f55514b;
        float f10 = 0.0f;
        if (z9) {
            kVar2.f55527c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f55527c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
