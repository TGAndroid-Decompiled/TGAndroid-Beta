package r9;
public final class r {
    public final Class f46453a;
    public final Class f46454b;

    public r(Class cls, Class cls2) {
        this.f46453a = cls;
        this.f46454b = cls2;
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
        if (!this.f46454b.equals(rVar.f46454b)) {
            return false;
        }
        return this.f46453a.equals(rVar.f46453a);
    }

    public final int hashCode() {
        return this.f46453a.hashCode() + (this.f46454b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f46454b;
        Class cls2 = this.f46453a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
