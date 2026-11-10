package u9;
public final class r {
    public final Class f56499a;
    public final Class f56500b;

    public r(Class cls, Class cls2) {
        this.f56499a = cls;
        this.f56500b = cls2;
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
        if (!this.f56500b.equals(rVar.f56500b)) {
            return false;
        }
        return this.f56499a.equals(rVar.f56499a);
    }

    public final int hashCode() {
        return this.f56499a.hashCode() + (this.f56500b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f56500b;
        Class cls2 = this.f56499a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
