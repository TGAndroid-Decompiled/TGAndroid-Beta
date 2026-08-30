package sa;
public final class z implements pa.v {
    public final wa.a f44240a;
    public final boolean f44241b;
    public final Class f44242c;
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
        this.f44240a = aVar;
        this.f44241b = z4;
        this.f44242c = cls;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        boolean isAssignableFrom;
        wa.a aVar2 = this.f44240a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f44241b || aVar2.f46506b != aVar.f46505a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f44242c.isAssignableFrom(aVar.f46505a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
