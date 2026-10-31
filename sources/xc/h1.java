package xc;
public enum h1 extends a2 {
    public h1() {
        super("AfterDoctypeName", 53);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f53653m;
        boolean j10 = aVar.j();
        v vVar = a2.f53598a;
        if (j10) {
            kVar.l(this);
            fVar.getClass();
            kVar.j();
            kVar.f53646c = vVar;
        } else if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
        } else if (aVar.m('>')) {
            kVar.j();
            kVar.a(vVar);
        } else if (aVar.l("PUBLIC")) {
            fVar.getClass();
            kVar.f53646c = a2.f53620r0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            kVar.f53646c = a2.f53629x0;
        } else {
            kVar.m(this);
            fVar.getClass();
            kVar.a(a2.C0);
        }
    }
}
