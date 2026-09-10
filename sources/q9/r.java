package q9;
public final class r {
    public final Class f40583a;
    public final Class f40584b;

    public r(Class cls, Class cls2) {
        this.f40583a = cls;
        this.f40584b = cls2;
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
        if (!this.f40584b.equals(rVar.f40584b)) {
            return false;
        }
        return this.f40583a.equals(rVar.f40583a);
    }

    public final int hashCode() {
        return this.f40583a.hashCode() + (this.f40584b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f40584b;
        Class cls2 = this.f40583a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
