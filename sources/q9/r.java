package q9;
public final class r {
    public final Class f44272a;
    public final Class f44273b;

    public r(Class cls, Class cls2) {
        this.f44272a = cls;
        this.f44273b = cls2;
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
        if (!this.f44273b.equals(rVar.f44273b)) {
            return false;
        }
        return this.f44272a.equals(rVar.f44272a);
    }

    public final int hashCode() {
        return this.f44272a.hashCode() + (this.f44273b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f44273b;
        Class cls2 = this.f44272a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
