package pc;
public enum c0 extends a2 {
    public c0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            j jVar = kVar.f44344i;
            char i10 = aVar.i();
            jVar.getClass();
            jVar.n(String.valueOf(i10));
            kVar.h.append(aVar.i());
            kVar.a(a2.M);
            return;
        }
        kVar.g("</");
        kVar.f44340c = a2.H;
    }
}
