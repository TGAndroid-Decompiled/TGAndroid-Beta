package xc;
public enum y1 extends a2 {
    public y1() {
        super("TagOpen", 7);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 != '!') {
            if (i10 != '/') {
                if (i10 != '?') {
                    if (aVar.o()) {
                        kVar.d(true);
                        kVar.f53664c = a2.f53637r;
                        return;
                    }
                    kVar.m(this);
                    kVar.f('<');
                    kVar.f53664c = a2.f53616a;
                    return;
                }
                kVar.a(a2.f53625f0);
                return;
            }
            kVar.a(a2.f53632n);
            return;
        }
        kVar.a(a2.f53626g0);
    }
}
