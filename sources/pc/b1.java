package pc;
public enum b1 extends a2 {
    public b1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f44349n;
        char d = aVar.d();
        z0 z0Var = a2.f44301g0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    v vVar = a2.f44290a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            StringBuilder sb = eVar.f44327c;
                            sb.append("--");
                            sb.append(d);
                            kVar.f44340c = z0Var;
                            return;
                        }
                        kVar.l(this);
                        kVar.i();
                        kVar.f44340c = vVar;
                        return;
                    }
                    kVar.i();
                    kVar.f44340c = vVar;
                    return;
                }
                kVar.m(this);
                eVar.f44327c.append('-');
                return;
            }
            kVar.m(this);
            kVar.f44340c = a2.f44304j0;
            return;
        }
        kVar.m(this);
        StringBuilder sb2 = eVar.f44327c;
        sb2.append("--");
        sb2.append((char) 65533);
        kVar.f44340c = z0Var;
    }
}
