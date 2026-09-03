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
                        v vVar = a2.f44321a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        kVar.k();
                                        kVar.f44371c = vVar;
                                        return;
                                    default:
                                        kVar.f44375i.p();
                                        aVar.q();
                                        kVar.f44371c = m0Var;
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.l(this);
                            kVar.f44371c = vVar;
                            return;
                        }
                    } else {
                        kVar.f44371c = a2.f44324b0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f44375i.p();
                kVar.f44375i.i(d);
                kVar.f44371c = m0Var;
                return;
            }
            return;
        }
        kVar.m(this);
        kVar.f44375i.p();
        aVar.q();
        kVar.f44371c = m0Var;
    }
}
