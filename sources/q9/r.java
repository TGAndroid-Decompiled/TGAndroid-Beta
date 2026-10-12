package q9;
public final class r {
    public final Class f45986a;
    public final Class f45987b;

    public r(Class cls, Class cls2) {
        this.f45986a = cls;
        this.f45987b = cls2;
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
        if (!this.f45987b.equals(rVar.f45987b)) {
            return false;
        }
        return this.f45986a.equals(rVar.f45986a);
    }

    public final int hashCode() {
        return this.f45986a.hashCode() + (this.f45987b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f45987b;
        Class cls2 = this.f45986a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
