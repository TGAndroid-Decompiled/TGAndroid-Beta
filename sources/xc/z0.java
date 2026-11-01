package xc;
public enum z0 extends a2 {
    public z0() {
        super("Comment", 46);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f53672n;
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != 65535) {
                    eVar.f53652c.append(aVar.g('-', 0));
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f53664c = a2.f53616a;
                return;
            }
            kVar.a(a2.f53630k0);
            return;
        }
        kVar.m(this);
        aVar.a();
        eVar.f53652c.append((char) 65533);
    }
}
