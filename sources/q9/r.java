package q9;
public final class r {
    public final Class f44878a;
    public final Class f44879b;

    public r(Class cls, Class cls2) {
        this.f44878a = cls;
        this.f44879b = cls2;
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
        if (!this.f44879b.equals(rVar.f44879b)) {
            return false;
        }
        return this.f44878a.equals(rVar.f44878a);
    }

    public final int hashCode() {
        return this.f44878a.hashCode() + (this.f44879b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f44879b;
        Class cls2 = this.f44878a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
