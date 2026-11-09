package u9;
public final class r {
    public final Class f56500a;
    public final Class f56501b;

    public r(Class cls, Class cls2) {
        this.f56500a = cls;
        this.f56501b = cls2;
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
        if (!this.f56501b.equals(rVar.f56501b)) {
            return false;
        }
        return this.f56500a.equals(rVar.f56500a);
    }

    public final int hashCode() {
        return this.f56500a.hashCode() + (this.f56501b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f56501b;
        Class cls2 = this.f56500a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
