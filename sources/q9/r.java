package q9;
public final class r {
    public final Class f41467a;
    public final Class f41468b;

    public r(Class cls, Class cls2) {
        this.f41467a = cls;
        this.f41468b = cls2;
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
        if (!this.f41468b.equals(rVar.f41468b)) {
            return false;
        }
        return this.f41467a.equals(rVar.f41467a);
    }

    public final int hashCode() {
        return this.f41467a.hashCode() + (this.f41468b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41468b;
        Class cls2 = this.f41467a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
