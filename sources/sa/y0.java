package sa;
public final class y0 implements pa.v {
    public final Class f44302a;
    public final Class f44303b;
    public final pa.u f44304c;

    public y0(Class cls, Class cls2, pa.u uVar) {
        this.f44302a = cls;
        this.f44303b = cls2;
        this.f44304c = uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.f46587a;
        if (cls != this.f44302a && cls != this.f44303b) {
            return null;
        }
        return this.f44304c;
    }

    public final String toString() {
        return "Factory[type=" + this.f44303b.getName() + "+" + this.f44302a.getName() + ",adapter=" + this.f44304c + "]";
    }
}
