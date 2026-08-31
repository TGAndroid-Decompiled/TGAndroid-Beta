package pc;
public enum m0 extends a2 {
    public m0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.D0);
        j jVar = kVar.f44344i;
        String str = jVar.f44331e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f44331e = h;
        char d = aVar.d();
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
                                        kVar.f44344i.i(d);
                                        return;
                                }
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
                kVar.f44344i.i(d);
                return;
            }
            kVar.f44340c = a2.V;
            return;
        }
        kVar.m(this);
        kVar.f44344i.i((char) 65533);
    }
}
