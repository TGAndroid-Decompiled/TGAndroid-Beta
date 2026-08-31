package pc;
public enum n0 extends a2 {
    public n0() {
        super("AfterAttributeName", 35);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = a2.U;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        v vVar = a2.f44290a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        kVar.f44340c = a2.W;
                                        return;
                                    case '>':
                                        kVar.k();
                                        kVar.f44340c = vVar;
                                        return;
                                    default:
                                        kVar.f44344i.p();
                                        aVar.q();
                                        kVar.f44340c = m0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.f44340c = vVar;
                            return;
                        }
                    } else {
                        kVar.f44340c = a2.f44293b0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f44344i.p();
                kVar.f44344i.i(d);
                kVar.f44340c = m0Var;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f44344i.i((char) 65533);
        kVar.f44340c = m0Var;
    }
}
