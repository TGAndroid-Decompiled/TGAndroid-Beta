package pc;
public enum a0 extends a2 {
    public a0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.f44371c = a2.f44321a;
            return;
        }
        char d = aVar.d();
        y yVar = a2.H;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        kVar.f(d);
                        kVar.f44371c = yVar;
                        return;
                    }
                    kVar.f(d);
                    kVar.f44371c = a2.f44330f;
                    return;
                }
                kVar.f44371c = a2.K;
                return;
            }
            kVar.f(d);
            return;
        }
        kVar.m(this);
        kVar.f((char) 65533);
        kVar.f44371c = yVar;
    }
}
