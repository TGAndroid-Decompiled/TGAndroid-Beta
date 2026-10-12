package q9;
public final class r {
    public final Class f45978a;
    public final Class f45979b;

    public r(Class cls, Class cls2) {
        this.f45978a = cls;
        this.f45979b = cls2;
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
        if (!this.f45979b.equals(rVar.f45979b)) {
            return false;
        }
        return this.f45978a.equals(rVar.f45978a);
    }

    public final int hashCode() {
        return this.f45978a.hashCode() + (this.f45979b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f45979b;
        Class cls2 = this.f45978a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
