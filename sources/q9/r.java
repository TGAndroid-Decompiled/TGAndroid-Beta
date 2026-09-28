package q9;
public final class r {
    public final Class f41495a;
    public final Class f41496b;

    public r(Class cls, Class cls2) {
        this.f41495a = cls;
        this.f41496b = cls2;
    }

    public static r a(Class cls) {
        return new r(q.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f41496b.equals(rVar.f41496b)) {
            return false;
        }
        return this.f41495a.equals(rVar.f41495a);
    }

    public final int hashCode() {
        return this.f41495a.hashCode() + (this.f41496b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41496b;
        Class cls2 = this.f41495a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
