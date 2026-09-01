package sa;
public final class y0 implements pa.v {
    public final Class f47227a;
    public final Class f47228b;
    public final pa.u f47229c;

    public y0(Class cls, Class cls2, pa.u uVar) {
        this.f47227a = cls;
        this.f47228b = cls2;
        this.f47229c = uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.f49484a;
        if (cls != this.f47227a && cls != this.f47228b) {
            return null;
        }
        return this.f47229c;
    }

    public final String toString() {
        return "Factory[type=" + this.f47228b.getName() + "+" + this.f47227a.getName() + ",adapter=" + this.f47229c + "]";
    }
}
