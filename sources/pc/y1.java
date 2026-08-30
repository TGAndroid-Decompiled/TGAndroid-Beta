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
                        kVar.f41174c = a2.f41148r;
                        return;
                    }
                    kVar.m(this);
                    kVar.f('<');
                    kVar.f41174c = a2.f41127a;
                    return;
                }
                kVar.a(a2.f41132c0);
                return;
            }
            kVar.a(a2.f41143n);
            return;
        }
        kVar.a(a2.f41133d0);
    }
}
