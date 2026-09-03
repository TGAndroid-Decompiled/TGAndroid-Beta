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
                v vVar = a2.f44321a;
                if (d != '>') {
                    if (d != 65535) {
                        kVar.m(this);
                        aVar.q();
                        kVar.f44371c = l0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.f44371c = vVar;
                    return;
                }
                kVar.k();
                kVar.f44371c = vVar;
                return;
            }
            kVar.f44371c = a2.f44324b0;
            return;
        }
        kVar.f44371c = l0Var;
    }
}
