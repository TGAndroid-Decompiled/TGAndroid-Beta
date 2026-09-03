package pc;
public enum o0 extends a2 {
    public o0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        s0 s0Var = a2.Z;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        v vVar = a2.f41150a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                if (d != '&') {
                                    if (d != '\'') {
                                        switch (d) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                kVar.m(this);
                                                kVar.k();
                                                kVar.f41197c = vVar;
                                                return;
                                            default:
                                                aVar.q();
                                                kVar.f41197c = s0Var;
                                                return;
                                        }
                                    } else {
                                        kVar.f41197c = a2.Y;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    kVar.f41197c = s0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.k();
                            kVar.f41197c = vVar;
                            return;
                        }
                    }
                    kVar.m(this);
                    kVar.f41200i.k(d);
                    kVar.f41197c = s0Var;
                    return;
                }
                kVar.f41197c = a2.X;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f41200i.k((char) 65533);
        kVar.f41197c = s0Var;
    }
}
