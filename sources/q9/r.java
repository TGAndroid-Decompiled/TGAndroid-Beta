package q9;
public final class r {
    public final Class f44271a;
    public final Class f44272b;

    public r(Class cls, Class cls2) {
        this.f44271a = cls;
        this.f44272b = cls2;
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
        if (!this.f44272b.equals(rVar.f44272b)) {
            return false;
        }
        return this.f44271a.equals(rVar.f44271a);
    }

    public final int hashCode() {
        return this.f44271a.hashCode() + (this.f44272b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f44272b;
        Class cls2 = this.f44271a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
