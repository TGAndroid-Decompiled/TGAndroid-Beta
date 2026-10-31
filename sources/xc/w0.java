package xc;
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.f53654n.b();
            kVar.f53646c = a2.f53609h0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.f53646c = a2.f53615n0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.f53646c = a2.D0;
        } else {
            kVar.m(this);
            kVar.a(a2.f53607f0);
        }
    }
}
