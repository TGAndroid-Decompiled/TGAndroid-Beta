package pc;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f41127a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f41174c = a2.T;
                return;
            }
            kVar.l(this);
            kVar.f41174c = vVar;
            return;
        }
        kVar.f41177i.f41169s = true;
        kVar.k();
        kVar.f41174c = vVar;
    }
}
