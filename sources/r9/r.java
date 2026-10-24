package r9;
public final class r {
    public final Class f45573a;
    public final Class f45574b;

    public r(Class cls, Class cls2) {
        this.f45573a = cls;
        this.f45574b = cls2;
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
        if (!this.f45574b.equals(rVar.f45574b)) {
            return false;
        }
        return this.f45573a.equals(rVar.f45573a);
    }

    public final int hashCode() {
        return this.f45573a.hashCode() + (this.f45574b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f45574b;
        Class cls2 = this.f45573a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
