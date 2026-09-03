package pc;
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
                        kVar.f41197c = a2.f41171r;
                        return;
                    }
                    kVar.m(this);
                    kVar.f('<');
                    kVar.f41197c = a2.f41150a;
                    return;
                }
                kVar.a(a2.f41155c0);
                return;
            }
            kVar.a(a2.f41166n);
            return;
        }
        kVar.a(a2.f41156d0);
    }
}
