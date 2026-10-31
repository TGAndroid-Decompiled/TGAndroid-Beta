package xc;
public enum c0 extends a2 {
    public c0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            j jVar = kVar.f53649i;
            char i10 = aVar.i();
            jVar.getClass();
            jVar.h(String.valueOf(i10));
            kVar.h.append(aVar.i());
            kVar.a(a2.P);
            return;
        }
        kVar.h("</");
        kVar.f53646c = a2.K;
    }
}
