package qa;
public final class z implements na.v {
    public final ua.a f46590a;
    public final boolean f46591b;
    public final Class f46592c;
    public final na.o d;

    public z(Object obj, ua.a aVar, boolean z10, Class cls) {
        na.o oVar;
        boolean z11;
        if (obj instanceof na.o) {
            oVar = (na.o) obj;
        } else {
            oVar = null;
        }
        this.d = oVar;
        if (oVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        pa.d.b(z11);
        this.f46590a = aVar;
        this.f46591b = z10;
        this.f46592c = cls;
    }

    @Override
    public final na.u create(na.g gVar, ua.a aVar) {
        boolean isAssignableFrom;
        ua.a aVar2 = this.f46590a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f46591b || aVar2.f49164b != aVar.f49163a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f46592c.isAssignableFrom(aVar.f49163a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
