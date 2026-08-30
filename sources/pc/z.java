package pc;
public enum z extends a2 {
    public z() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.f41174c = a2.f41127a;
            return;
        }
        char d = aVar.d();
        y yVar = a2.H;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    kVar.f(d);
                    kVar.f41174c = yVar;
                    return;
                }
                kVar.f41174c = a2.K;
                return;
            }
            kVar.f(d);
            kVar.f41174c = a2.J;
            return;
        }
        kVar.m(this);
        kVar.f((char) 65533);
        kVar.f41174c = yVar;
    }
}
