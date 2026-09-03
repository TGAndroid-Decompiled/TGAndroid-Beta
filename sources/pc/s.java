package pc;
public enum s extends a2 {
    public s() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d != '!') {
            if (d != '/') {
                kVar.g("<");
                aVar.q();
                kVar.f44371c = a2.f44330f;
                return;
            }
            kVar.e();
            kVar.f44371c = a2.D;
            return;
        }
        kVar.g("<!");
        kVar.f44371c = a2.F;
    }
}
