package q9;
public final class r {
    public final Class f46039a;
    public final Class f46040b;

    public r(Class cls, Class cls2) {
        this.f46039a = cls;
        this.f46040b = cls2;
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
        if (!this.f46040b.equals(rVar.f46040b)) {
            return false;
        }
        return this.f46039a.equals(rVar.f46039a);
    }

    public final int hashCode() {
        return this.f46039a.hashCode() + (this.f46040b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f46040b;
        Class cls2 = this.f46039a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
