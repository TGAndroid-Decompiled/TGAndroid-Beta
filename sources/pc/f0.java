package pc;
public enum f0 extends a2 {
    public f0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != '<') {
                    if (i10 != 65535) {
                        kVar.g(aVar.g('-', '<', 0));
                        return;
                    }
                    kVar.l(this);
                    kVar.f41174c = a2.f41127a;
                    return;
                }
                kVar.f(i10);
                kVar.a(a2.R);
                return;
            }
            kVar.f(i10);
            kVar.a(a2.P);
            return;
        }
        kVar.m(this);
        aVar.a();
        kVar.f((char) 65533);
    }
}
