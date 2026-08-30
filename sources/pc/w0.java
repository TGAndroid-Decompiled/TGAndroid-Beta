package pc;
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.f41182n.h();
            kVar.f41174c = a2.f41134e0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.f41174c = a2.f41141k0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.f41174c = a2.A0;
        } else {
            kVar.m(this);
            kVar.a(a2.f41132c0);
        }
    }
}
