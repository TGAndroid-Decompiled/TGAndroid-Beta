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
                kVar.f41197c = a2.f41158f;
                return;
            }
            kVar.e();
            kVar.f41197c = a2.D;
            return;
        }
        kVar.g("<!");
        kVar.f41197c = a2.F;
    }
}
