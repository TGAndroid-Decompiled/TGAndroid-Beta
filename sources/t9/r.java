package t9;
public final class r {
    public final Class f55075a;
    public final Class f55076b;

    public r(Class cls, Class cls2) {
        this.f55075a = cls;
        this.f55076b = cls2;
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
        if (!this.f55076b.equals(rVar.f55076b)) {
            return false;
        }
        return this.f55075a.equals(rVar.f55075a);
    }

    public final int hashCode() {
        return this.f55075a.hashCode() + (this.f55076b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f55076b;
        Class cls2 = this.f55075a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
