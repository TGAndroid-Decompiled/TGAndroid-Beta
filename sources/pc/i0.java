package pc;
public enum i0 extends a2 {
    public i0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        f0 f0Var = a2.O;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.f(d);
                            kVar.f44371c = f0Var;
                            return;
                        }
                        kVar.l(this);
                        kVar.f44371c = a2.f44321a;
                        return;
                    }
                    kVar.f(d);
                    kVar.f44371c = a2.f44330f;
                    return;
                }
                kVar.f(d);
                kVar.f44371c = a2.R;
                return;
            }
            kVar.f(d);
            return;
        }
        kVar.m(this);
        kVar.f((char) 65533);
        kVar.f44371c = f0Var;
    }
}
