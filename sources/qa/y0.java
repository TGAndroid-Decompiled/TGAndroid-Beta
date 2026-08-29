package qa;
public final class y0 implements na.v {
    public final Class f46587a;
    public final Class f46588b;
    public final na.u f46589c;

    public y0(Class cls, Class cls2, na.u uVar) {
        this.f46587a = cls;
        this.f46588b = cls2;
        this.f46589c = uVar;
    }

    @Override
    public final na.u create(na.g gVar, ua.a aVar) {
        Class cls = aVar.f49163a;
        if (cls != this.f46587a && cls != this.f46588b) {
            return null;
        }
        return this.f46589c;
    }

    public final String toString() {
        return "Factory[type=" + this.f46588b.getName() + "+" + this.f46587a.getName() + ",adapter=" + this.f46589c + "]";
    }
}
