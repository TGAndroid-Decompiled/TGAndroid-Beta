package pc;
public enum t0 extends a2 {
    public t0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        l0 l0Var = a2.T;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                v vVar = a2.f41127a;
                if (d != '>') {
                    if (d != 65535) {
                        kVar.m(this);
                        aVar.q();
                        kVar.f41174c = l0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.f41174c = vVar;
                    return;
                }
                kVar.k();
                kVar.f41174c = vVar;
                return;
            }
            kVar.f41174c = a2.f41130b0;
            return;
        }
        kVar.f41174c = l0Var;
    }
}
