package pc;
public enum m0 extends a2 {
    public m0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.D0);
        j jVar = kVar.f41177i;
        String str = jVar.e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        v vVar = a2.f41127a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        kVar.f41174c = a2.W;
                                        return;
                                    case '>':
                                        kVar.k();
                                        kVar.f41174c = vVar;
                                        return;
                                    default:
                                        kVar.f41177i.j(d);
                                        return;
                                }
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
                kVar.f41177i.j(d);
                return;
            }
            kVar.f41174c = a2.V;
            return;
        }
        kVar.m(this);
        kVar.f41177i.j((char) 65533);
    }
}
