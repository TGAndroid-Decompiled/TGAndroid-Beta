package pc;
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.f44380n.g();
            kVar.f44371c = a2.f44329e0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.f44371c = a2.f44336k0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.f44371c = a2.A0;
        } else {
            kVar.m(this);
            kVar.a(a2.f44326c0);
        }
    }
}
