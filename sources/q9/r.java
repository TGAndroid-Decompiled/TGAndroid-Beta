package q9;
public final class r {
    public final Class f41497a;
    public final Class f41498b;

    public r(Class cls, Class cls2) {
        this.f41497a = cls;
        this.f41498b = cls2;
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
        if (!this.f41498b.equals(rVar.f41498b)) {
            return false;
        }
        return this.f41497a.equals(rVar.f41497a);
    }

    public final int hashCode() {
        return this.f41497a.hashCode() + (this.f41498b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41498b;
        Class cls2 = this.f41497a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
