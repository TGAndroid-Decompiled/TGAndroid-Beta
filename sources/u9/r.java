package u9;
public final class r {
    public final Class f56487a;
    public final Class f56488b;

    public r(Class cls, Class cls2) {
        this.f56487a = cls;
        this.f56488b = cls2;
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
        if (!this.f56488b.equals(rVar.f56488b)) {
            return false;
        }
        return this.f56487a.equals(rVar.f56487a);
    }

    public final int hashCode() {
        return this.f56487a.hashCode() + (this.f56488b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f56488b;
        Class cls2 = this.f56487a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
