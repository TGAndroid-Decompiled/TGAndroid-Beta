package xc;
public enum n extends a2 {
    public n() {
        super("RCDATAEndTagOpen", 11);
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
            kVar.a(a2.f53628x);
            return;
        }
        kVar.h("</");
        kVar.f53646c = a2.f53602c;
    }
}
