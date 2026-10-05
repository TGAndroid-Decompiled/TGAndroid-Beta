package q9;
public final class r {
    public final Class f44885a;
    public final Class f44886b;

    public r(Class cls, Class cls2) {
        this.f44885a = cls;
        this.f44886b = cls2;
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
        if (!this.f44886b.equals(rVar.f44886b)) {
            return false;
        }
        return this.f44885a.equals(rVar.f44885a);
    }

    public final int hashCode() {
        return this.f44885a.hashCode() + (this.f44886b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f44886b;
        Class cls2 = this.f44885a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
