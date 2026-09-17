package q9;
public final class r {
    public final Class f44244a;
    public final Class f44245b;

    public r(Class cls, Class cls2) {
        this.f44244a = cls;
        this.f44245b = cls2;
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
        if (!this.f44245b.equals(rVar.f44245b)) {
            return false;
        }
        return this.f44244a.equals(rVar.f44244a);
    }

    public final int hashCode() {
        return this.f44244a.hashCode() + (this.f44245b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f44245b;
        Class cls2 = this.f44244a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
