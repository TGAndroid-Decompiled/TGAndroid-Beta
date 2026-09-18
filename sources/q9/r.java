package q9;
public final class r {
    public final Class f41233a;
    public final Class f41234b;

    public r(Class cls, Class cls2) {
        this.f41233a = cls;
        this.f41234b = cls2;
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
        if (!this.f41234b.equals(rVar.f41234b)) {
            return false;
        }
        return this.f41233a.equals(rVar.f41233a);
    }

    public final int hashCode() {
        return this.f41233a.hashCode() + (this.f41234b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41234b;
        Class cls2 = this.f41233a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
