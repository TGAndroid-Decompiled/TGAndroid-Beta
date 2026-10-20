package r9;
public final class r {
    public final Class f45158a;
    public final Class f45159b;

    public r(Class cls, Class cls2) {
        this.f45158a = cls;
        this.f45159b = cls2;
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
        if (!this.f45159b.equals(rVar.f45159b)) {
            return false;
        }
        return this.f45158a.equals(rVar.f45158a);
    }

    public final int hashCode() {
        return this.f45158a.hashCode() + (this.f45159b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f45159b;
        Class cls2 = this.f45158a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
