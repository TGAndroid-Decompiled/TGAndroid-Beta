package r9;
public final class r {
    public final Class f45574a;
    public final Class f45575b;

    public r(Class cls, Class cls2) {
        this.f45574a = cls;
        this.f45575b = cls2;
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
        if (!this.f45575b.equals(rVar.f45575b)) {
            return false;
        }
        return this.f45574a.equals(rVar.f45574a);
    }

    public final int hashCode() {
        return this.f45574a.hashCode() + (this.f45575b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f45575b;
        Class cls2 = this.f45574a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
