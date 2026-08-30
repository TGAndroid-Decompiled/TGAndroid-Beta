package pc;
public enum z0 extends a2 {
    public z0() {
        super("Comment", 46);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f41182n;
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != 65535) {
                    eVar.f41163c.append(aVar.g('-', 0));
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f41174c = a2.f41127a;
                return;
            }
            kVar.a(a2.f41138h0);
            return;
        }
        kVar.m(this);
        aVar.a();
        eVar.f41163c.append((char) 65533);
    }
}
