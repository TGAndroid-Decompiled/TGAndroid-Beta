package pc;
public enum n extends a2 {
    public n() {
        super("RCDATAEndTagOpen", 11);
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
            kVar.a(a2.f41155w);
            return;
        }
        kVar.g("</");
        kVar.f41174c = a2.f41131c;
    }
}
