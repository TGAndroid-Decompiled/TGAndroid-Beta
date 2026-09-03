package sa;
public final class y0 implements pa.v {
    public final Class f47258a;
    public final Class f47259b;
    public final pa.u f47260c;

    public y0(Class cls, Class cls2, pa.u uVar) {
        this.f47258a = cls;
        this.f47259b = cls2;
        this.f47260c = uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        Class cls = aVar.f49520a;
        if (cls != this.f47258a && cls != this.f47259b) {
            return null;
        }
        return this.f47260c;
    }

    public final String toString() {
        return "Factory[type=" + this.f47259b.getName() + "+" + this.f47258a.getName() + ",adapter=" + this.f47260c + "]";
    }
}
