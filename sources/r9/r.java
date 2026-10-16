package r9;
public final class r {
    public final Class f43820a;
    public final Class f43821b;

    public r(Class cls, Class cls2) {
        this.f43820a = cls;
        this.f43821b = cls2;
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
        if (!this.f43821b.equals(rVar.f43821b)) {
            return false;
        }
        return this.f43820a.equals(rVar.f43820a);
    }

    public final int hashCode() {
        return this.f43820a.hashCode() + (this.f43821b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f43821b;
        Class cls2 = this.f43820a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
