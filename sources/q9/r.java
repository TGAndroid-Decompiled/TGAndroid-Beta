package q9;
public final class r {
    public final Class f41525a;
    public final Class f41526b;

    public r(Class cls, Class cls2) {
        this.f41525a = cls;
        this.f41526b = cls2;
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
        if (!this.f41526b.equals(rVar.f41526b)) {
            return false;
        }
        return this.f41525a.equals(rVar.f41525a);
    }

    public final int hashCode() {
        return this.f41525a.hashCode() + (this.f41526b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41526b;
        Class cls2 = this.f41525a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
