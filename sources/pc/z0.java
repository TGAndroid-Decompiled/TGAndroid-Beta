package pc;
public enum z0 extends a2 {
    public z0() {
        super("Comment", 46);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f44380n;
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != 65535) {
                    eVar.f44358c.append(aVar.g('-', 0));
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f44371c = a2.f44321a;
                return;
            }
            kVar.a(a2.f44333h0);
            return;
        }
        kVar.m(this);
        aVar.a();
        eVar.f44358c.append((char) 65533);
    }
}
