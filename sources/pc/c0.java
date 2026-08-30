package pc;
public enum c0 extends a2 {
    public c0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            j jVar = kVar.f41177i;
            char i10 = aVar.i();
            jVar.getClass();
            jVar.o(String.valueOf(i10));
            kVar.h.append(aVar.i());
            kVar.a(a2.M);
            return;
        }
        kVar.g("</");
        kVar.f41174c = a2.H;
    }
}
