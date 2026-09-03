package pc;
public enum x0 extends a2 {
    public x0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f44380n;
        char d = aVar.d();
        z0 z0Var = a2.f44332g0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f44321a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f44358c.append(d);
                        kVar.f44371c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f44371c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f44371c = vVar;
                return;
            }
            kVar.f44371c = a2.f44331f0;
            return;
        }
        kVar.m(this);
        eVar.f44358c.append((char) 65533);
        kVar.f44371c = z0Var;
    }
}
