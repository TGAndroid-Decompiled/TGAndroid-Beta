package xc;
public enum o0 extends a2 {
    public o0() {
        super("BeforeAttributeValue", 36);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        s0 s0Var = a2.f53621c0;
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"') {
                    if (d != '`') {
                        v vVar = a2.f53616a;
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
                                                kVar.f53664c = vVar;
                                                return;
                                            default:
                                                aVar.q();
                                                kVar.f53664c = s0Var;
                                                return;
                                        }
                                    } else {
                                        kVar.f53664c = a2.f53619b0;
                                        return;
                                    }
                                } else {
                                    aVar.q();
                                    kVar.f53664c = s0Var;
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.k();
                            kVar.f53664c = vVar;
                            return;
                        }
                    }
                    kVar.m(this);
                    kVar.f53667i.e(d);
                    kVar.f53664c = s0Var;
                    return;
                }
                kVar.f53664c = a2.f53617a0;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f53667i.e((char) 65533);
        kVar.f53664c = s0Var;
    }
}
