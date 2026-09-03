package pc;
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.f41205n.g();
            kVar.f41197c = a2.f41157e0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.f41197c = a2.f41164k0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.f41197c = a2.A0;
        } else {
            kVar.m(this);
            kVar.a(a2.f41155c0);
        }
    }
}
