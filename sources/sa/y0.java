package sa;
public final class y0 implements pa.v {
    public final Class f44237a;
    public final Class f44238b;
    public final pa.u f44239c;

    public y0(Class cls, Class cls2, pa.u uVar) {
        this.f44237a = cls;
        this.f44238b = cls2;
        this.f44239c = uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.f46505a;
        if (cls != this.f44237a && cls != this.f44238b) {
            return null;
        }
        return this.f44239c;
    }

    public final String toString() {
        return "Factory[type=" + this.f44238b.getName() + "+" + this.f44237a.getName() + ",adapter=" + this.f44239c + "]";
    }
}
