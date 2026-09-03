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
                        v vVar = a2.f41150a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        kVar.f41197c = a2.W;
                                        return;
                                    case '>':
                                        kVar.k();
                                        kVar.f41197c = vVar;
                                        return;
                                    default:
                                        kVar.f41200i.p();
                                        aVar.q();
                                        kVar.f41197c = m0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.f41197c = vVar;
                            return;
                        }
                    } else {
                        kVar.f41197c = a2.f41153b0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f41200i.p();
                kVar.f41200i.j(d);
                kVar.f41197c = m0Var;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f41200i.j((char) 65533);
        kVar.f41197c = m0Var;
    }
}
