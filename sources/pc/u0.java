package pc;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f44290a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f44340c = a2.T;
                return;
            }
            kVar.l(this);
            kVar.f44340c = vVar;
            return;
        }
        kVar.f44344i.f44335s = true;
        kVar.k();
        kVar.f44340c = vVar;
    }
}
