package sa;
public final class z implements pa.v {
    public final wa.a f47261a;
    public final boolean f47262b;
    public final Class f47263c;
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
        this.f47261a = aVar;
        this.f47262b = z4;
        this.f47263c = cls;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        boolean isAssignableFrom;
        wa.a aVar2 = this.f47261a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f47262b || aVar2.f49521b != aVar.f49520a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.f47263c.isAssignableFrom(aVar.f49520a);
        }
        if (isAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
