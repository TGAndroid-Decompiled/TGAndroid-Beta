package pc;
public enum e1 extends a2 {
    public e1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f44348m;
        char d = aVar.d();
        f1 f1Var = a2.f44306l0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    kVar.m(this);
                    kVar.f44340c = f1Var;
                    return;
                }
                kVar.l(this);
            }
            kVar.m(this);
            fVar.g();
            fVar.getClass();
            kVar.j();
            kVar.f44340c = a2.f44290a;
            return;
        }
        kVar.f44340c = f1Var;
    }
}
