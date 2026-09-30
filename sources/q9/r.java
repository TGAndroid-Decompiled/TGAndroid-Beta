package q9;
public final class r {
    public final Class f41594a;
    public final Class f41595b;

    public r(Class cls, Class cls2) {
        this.f41594a = cls;
        this.f41595b = cls2;
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
        if (!this.f41595b.equals(rVar.f41595b)) {
            return false;
        }
        return this.f41594a.equals(rVar.f41594a);
    }

    public final int hashCode() {
        return this.f41594a.hashCode() + (this.f41595b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41595b;
        Class cls2 = this.f41594a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
