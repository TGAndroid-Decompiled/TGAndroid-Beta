package q9;
public final class r {
    public final Class f41158a;
    public final Class f41159b;

    public r(Class cls, Class cls2) {
        this.f41158a = cls;
        this.f41159b = cls2;
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
        if (!this.f41159b.equals(rVar.f41159b)) {
            return false;
        }
        return this.f41158a.equals(rVar.f41158a);
    }

    public final int hashCode() {
        return this.f41158a.hashCode() + (this.f41159b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41159b;
        Class cls2 = this.f41158a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
