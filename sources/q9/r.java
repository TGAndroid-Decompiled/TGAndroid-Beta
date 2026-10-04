package q9;
public final class r {
    public final Class f44871a;
    public final Class f44872b;

    public r(Class cls, Class cls2) {
        this.f44871a = cls;
        this.f44872b = cls2;
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
        if (!this.f44872b.equals(rVar.f44872b)) {
            return false;
        }
        return this.f44871a.equals(rVar.f44871a);
    }

    public final int hashCode() {
        return this.f44871a.hashCode() + (this.f44872b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f44872b;
        Class cls2 = this.f44871a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
