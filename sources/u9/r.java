package u9;
public final class r {
    public final Class f56488a;
    public final Class f56489b;

    public r(Class cls, Class cls2) {
        this.f56488a = cls;
        this.f56489b = cls2;
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
        if (!this.f56489b.equals(rVar.f56489b)) {
            return false;
        }
        return this.f56488a.equals(rVar.f56488a);
    }

    public final int hashCode() {
        return this.f56488a.hashCode() + (this.f56489b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f56489b;
        Class cls2 = this.f56488a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
