package xc;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f53598a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f53646c = a2.W;
                return;
            }
            kVar.l(this);
            kVar.f53646c = vVar;
            return;
        }
        kVar.f53649i.f53640j = true;
        kVar.k();
        kVar.f53646c = vVar;
    }
}
