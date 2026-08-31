package pc;
public enum y extends a2 {
    public y() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.f44340c = a2.f44290a;
            return;
        }
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != '<') {
                    kVar.g(aVar.g('-', '<', 0));
                    return;
                } else {
                    kVar.a(a2.K);
                    return;
                }
            }
            kVar.f('-');
            kVar.a(a2.I);
            return;
        }
        kVar.m(this);
        aVar.a();
        kVar.f((char) 65533);
    }
}
