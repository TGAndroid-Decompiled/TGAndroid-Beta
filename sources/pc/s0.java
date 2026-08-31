package pc;
public enum s0 extends a2 {
    public s0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.E0);
        if (h.length() > 0) {
            kVar.f44344i.k(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
                    v vVar = a2.f44290a;
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            if (d != '&') {
                                if (d != '\'') {
                                    switch (d) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            kVar.k();
                                            kVar.f44340c = vVar;
                                            return;
                                        default:
                                            kVar.f44344i.j(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c3 = kVar.c('>', true);
                                if (c3 != null) {
                                    kVar.f44344i.m(c3);
                                    return;
                                } else {
                                    kVar.f44344i.j('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        kVar.l(this);
                        kVar.f44340c = vVar;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f44344i.j(d);
                return;
            }
            kVar.f44340c = a2.T;
            return;
        }
        kVar.m(this);
        kVar.f44344i.j((char) 65533);
    }
}
