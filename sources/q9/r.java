package q9;
public final class r {
    public final Class f41206a;
    public final Class f41207b;

    public r(Class cls, Class cls2) {
        this.f41206a = cls;
        this.f41207b = cls2;
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
        if (!this.f41207b.equals(rVar.f41207b)) {
            return false;
        }
        return this.f41206a.equals(rVar.f41206a);
    }

    public final int hashCode() {
        return this.f41206a.hashCode() + (this.f41207b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41207b;
        Class cls2 = this.f41206a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
