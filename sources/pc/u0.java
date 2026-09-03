package pc;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f44321a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f44371c = a2.T;
                return;
            }
            kVar.l(this);
            kVar.f44371c = vVar;
            return;
        }
        kVar.f44375i.f44366s = true;
        kVar.k();
        kVar.f44371c = vVar;
    }
}
