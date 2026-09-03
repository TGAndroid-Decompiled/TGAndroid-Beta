package pc;
public enum t extends a2 {
    public t() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            kVar.f41197c = a2.E;
            return;
        }
        kVar.g("</");
        kVar.f41197c = a2.f41158f;
    }
}
