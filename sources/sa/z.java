package sa;
public final class z implements pa.v {
    public final wa.a f44305a;
    public final boolean f44306b;
    public final Class f44307c;
    public final pa.o d;

    public z(Object obj, wa.a aVar, boolean z4, Class cls) {
        pa.o oVar;
        boolean z10;
        if (obj instanceof pa.o) {
            oVar = (pa.o) obj;
        } else {
            oVar = null;
        }
        this.d = oVar;
        if (oVar == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ra.d.b(z10);
        this.f44305a = aVar;
        this.f44306b = z4;
        this.f44307c = cls;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        boolean isAssignableFrom;
        wa.a aVar2 = this.f44305a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f44306b || aVar2.f46588b != aVar.f46587a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f44307c.isAssignableFrom(aVar.f46587a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
