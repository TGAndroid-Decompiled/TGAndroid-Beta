package xc;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f53616a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f53664c = a2.W;
                return;
            }
            kVar.l(this);
            kVar.f53664c = vVar;
            return;
        }
        kVar.f53667i.f53658j = true;
        kVar.k();
        kVar.f53664c = vVar;
    }
}
