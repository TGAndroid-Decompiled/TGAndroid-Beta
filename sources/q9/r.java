package q9;
public final class r {
    public final Class f41202a;
    public final Class f41203b;

    public r(Class cls, Class cls2) {
        this.f41202a = cls;
        this.f41203b = cls2;
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
        if (!this.f41203b.equals(rVar.f41203b)) {
            return false;
        }
        return this.f41202a.equals(rVar.f41202a);
    }

    public final int hashCode() {
        return this.f41202a.hashCode() + (this.f41203b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41203b;
        Class cls2 = this.f41202a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
