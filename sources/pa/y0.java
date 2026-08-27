package pa;

public final class y0 implements ma.v {

    public final Class f45680a;

    public final Class f45681b;

    public final ma.u f45682c;

    public y0(Class cls, Class cls2, ma.u uVar) {
        this.f45680a = cls;
        this.f45681b = cls2;
        this.f45682c = uVar;
    }

    @Override
    public final ma.u create(ma.g gVar, ta.a aVar) {
        Class cls = aVar.f48151a;
        if (cls == this.f45680a || cls == this.f45681b) {
            return this.f45682c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f45681b.getName() + "+" + this.f45680a.getName() + ",adapter=" + this.f45682c + "]";
    }
}
