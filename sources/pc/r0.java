package pc;
public enum r0 extends a2 {
    public r0() {
        super("Rcdata", 2);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '&') {
                if (i10 != '<') {
                    if (i10 != 65535) {
                        kVar.g(aVar.g('&', '<', 0));
                        return;
                    } else {
                        kVar.h(new g());
                        return;
                    }
                }
                kVar.a(a2.f44345s);
                return;
            }
            kVar.a(a2.d);
            return;
        }
        kVar.m(this);
        aVar.a();
        kVar.f((char) 65533);
    }
}
