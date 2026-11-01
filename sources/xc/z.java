package xc;
public enum z extends a2 {
    public z() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.f53664c = a2.f53616a;
            return;
        }
        char d = aVar.d();
        y yVar = a2.K;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    kVar.f(d);
                    kVar.f53664c = yVar;
                    return;
                }
                kVar.f53664c = a2.N;
                return;
            }
            kVar.f(d);
            kVar.f53664c = a2.M;
            return;
        }
        kVar.m(this);
        kVar.f((char) 65533);
        kVar.f53664c = yVar;
    }
}
