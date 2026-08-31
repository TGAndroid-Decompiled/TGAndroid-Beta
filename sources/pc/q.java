package pc;
public enum q extends a2 {
    public q() {
        super("RawtextEndTagOpen", 14);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            kVar.f44340c = a2.B;
            return;
        }
        kVar.g("</");
        kVar.f44340c = a2.f44297e;
    }
}
