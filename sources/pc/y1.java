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
                        kVar.f44371c = a2.f44343r;
                        return;
                    }
                    kVar.m(this);
                    kVar.f('<');
                    kVar.f44371c = a2.f44321a;
                    return;
                }
                kVar.a(a2.f44326c0);
                return;
            }
            kVar.a(a2.f44338n);
            return;
        }
        kVar.a(a2.f44327d0);
    }
}
