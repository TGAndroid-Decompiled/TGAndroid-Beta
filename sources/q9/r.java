package q9;
public final class r {
    public final Class f44243a;
    public final Class f44244b;

    public r(Class cls, Class cls2) {
        this.f44243a = cls;
        this.f44244b = cls2;
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
        if (!this.f44244b.equals(rVar.f44244b)) {
            return false;
        }
        return this.f44243a.equals(rVar.f44243a);
    }

    public final int hashCode() {
        return this.f44243a.hashCode() + (this.f44244b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f44244b;
        Class cls2 = this.f44243a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
