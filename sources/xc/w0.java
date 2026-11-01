package xc;
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.f53672n.b();
            kVar.f53664c = a2.f53627h0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.f53664c = a2.f53633n0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.f53664c = a2.D0;
        } else {
            kVar.m(this);
            kVar.a(a2.f53625f0);
        }
    }
}
