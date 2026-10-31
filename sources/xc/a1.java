package xc;
public enum a1 extends a2 {
    public a1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f53654n;
        char d = aVar.d();
        z0 z0Var = a2.f53611j0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f53634c;
                    sb2.append('-');
                    sb2.append(d);
                    kVar.f53646c = z0Var;
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f53646c = a2.f53598a;
                return;
            }
            kVar.f53646c = a2.f53613l0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f53634c;
        sb3.append('-');
        sb3.append((char) 65533);
        kVar.f53646c = z0Var;
    }
}
