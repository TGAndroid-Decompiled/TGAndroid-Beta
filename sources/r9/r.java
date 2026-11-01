package r9;
public final class r {
    public final Class f46464a;
    public final Class f46465b;

    public r(Class cls, Class cls2) {
        this.f46464a = cls;
        this.f46465b = cls2;
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
        if (!this.f46465b.equals(rVar.f46465b)) {
            return false;
        }
        return this.f46464a.equals(rVar.f46464a);
    }

    public final int hashCode() {
        return this.f46464a.hashCode() + (this.f46465b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f46465b;
        Class cls2 = this.f46464a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
