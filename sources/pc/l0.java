package pc;
public enum l0 extends a2 {
    public l0() {
        super("BeforeAttributeName", 33);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = a2.U;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        v vVar = a2.f41127a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        kVar.k();
                                        kVar.f41174c = vVar;
                                        return;
                                    default:
                                        kVar.f41177i.r();
                                        aVar.q();
                                        kVar.f41174c = m0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.f41174c = vVar;
                            return;
                        }
                    } else {
                        kVar.f41174c = a2.f41130b0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f41177i.r();
                kVar.f41177i.j(d);
                kVar.f41174c = m0Var;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f41177i.r();
        aVar.q();
        kVar.f41174c = m0Var;
    }
}
