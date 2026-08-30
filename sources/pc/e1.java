package pc;
public enum e1 extends a2 {
    public e1() {
        super("Doctype", 50);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f41181m;
        char d = aVar.d();
        f1 f1Var = a2.f41142l0;
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '>') {
                if (d != 65535) {
                    kVar.m(this);
                    kVar.f41174c = f1Var;
                    return;
                }
                kVar.l(this);
            }
            kVar.m(this);
            fVar.h();
            fVar.getClass();
            kVar.j();
            kVar.f41174c = a2.f41127a;
            return;
        }
        kVar.f41174c = f1Var;
    }
}
