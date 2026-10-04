package q9;
public final class r {
    public final Class f44870a;
    public final Class f44871b;

    public r(Class cls, Class cls2) {
        this.f44870a = cls;
        this.f44871b = cls2;
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
        if (!this.f44871b.equals(rVar.f44871b)) {
            return false;
        }
        return this.f44870a.equals(rVar.f44870a);
    }

    public final int hashCode() {
        return this.f44870a.hashCode() + (this.f44871b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f44871b;
        Class cls2 = this.f44870a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
