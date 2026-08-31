package pc;
public enum h1 extends a2 {
    public h1() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f44348m;
        boolean j10 = aVar.j();
        v vVar = a2.f44290a;
        if (j10) {
            kVar.l(this);
            fVar.getClass();
            kVar.j();
            kVar.f44340c = vVar;
        } else if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
        } else if (aVar.m('>')) {
            kVar.j();
            kVar.a(vVar);
        } else if (aVar.l("PUBLIC")) {
            fVar.getClass();
            kVar.f44340c = a2.f44309o0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            kVar.f44340c = a2.f44317u0;
        } else {
            kVar.m(this);
            fVar.getClass();
            kVar.a(a2.f44325z0);
        }
    }
}
