package r9;
public final class r {
    public final Class f45148a;
    public final Class f45149b;

    public r(Class cls, Class cls2) {
        this.f45148a = cls;
        this.f45149b = cls2;
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
        if (!this.f45149b.equals(rVar.f45149b)) {
            return false;
        }
        return this.f45148a.equals(rVar.f45148a);
    }

    public final int hashCode() {
        return this.f45148a.hashCode() + (this.f45149b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f45149b;
        Class cls2 = this.f45148a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
