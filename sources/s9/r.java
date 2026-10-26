package s9;
public final class r {
    public final Class f48015a;
    public final Class f48016b;

    public r(Class cls, Class cls2) {
        this.f48015a = cls;
        this.f48016b = cls2;
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
        if (!this.f48016b.equals(rVar.f48016b)) {
            return false;
        }
        return this.f48015a.equals(rVar.f48015a);
    }

    public final int hashCode() {
        return this.f48015a.hashCode() + (this.f48016b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f48016b;
        Class cls2 = this.f48015a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
