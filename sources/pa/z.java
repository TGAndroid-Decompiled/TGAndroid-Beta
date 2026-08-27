package pa;

public final class z implements ma.v {

    public final ta.a f45683a;

    public final boolean f45684b;

    public final Class f45685c;
    public final ma.o d;

    public z(Object obj, ta.a aVar, boolean z10, Class cls) {
        ma.o oVar = obj instanceof ma.o ? (ma.o) obj : null;
        this.d = oVar;
        oa.d.b(oVar != null);
        this.f45683a = aVar;
        this.f45684b = z10;
        this.f45685c = cls;
    }

    @Override
    public final ma.u create(ma.g gVar, ta.a aVar) {
        boolean zIsAssignableFrom;
        ta.a aVar2 = this.f45683a;
        if (aVar2 != null) {
            zIsAssignableFrom = aVar2.equals(aVar) || (this.f45684b && aVar2.f48152b == aVar.f48151a);
        } else {
            zIsAssignableFrom = this.f45685c.isAssignableFrom(aVar.f48151a);
        }
        if (zIsAssignableFrom) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
