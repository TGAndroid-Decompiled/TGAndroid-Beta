package xc;
public enum t0 extends a2 {
    public t0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        l0 l0Var = a2.W;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                v vVar = a2.f53598a;
                if (d != '>') {
                    if (d != 65535) {
                        kVar.m(this);
                        aVar.q();
                        kVar.f53646c = l0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.f53646c = vVar;
                    return;
                }
                kVar.k();
                kVar.f53646c = vVar;
                return;
            }
            kVar.f53646c = a2.f53605e0;
            return;
        }
        kVar.f53646c = l0Var;
    }
}
