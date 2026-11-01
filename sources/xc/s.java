package xc;
public enum s extends a2 {
    public s() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d != '!') {
            if (d != '/') {
                kVar.h("<");
                aVar.q();
                kVar.f53664c = a2.f53624f;
                return;
            }
            kVar.e();
            kVar.f53664c = a2.G;
            return;
        }
        kVar.h("<!");
        kVar.f53664c = a2.I;
    }
}
