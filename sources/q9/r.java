package q9;
public final class r {
    public final Class f41494a;
    public final Class f41495b;

    public r(Class cls, Class cls2) {
        this.f41494a = cls;
        this.f41495b = cls2;
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
        if (!this.f41495b.equals(rVar.f41495b)) {
            return false;
        }
        return this.f41494a.equals(rVar.f41494a);
    }

    public final int hashCode() {
        return this.f41494a.hashCode() + (this.f41495b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41495b;
        Class cls2 = this.f41494a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
