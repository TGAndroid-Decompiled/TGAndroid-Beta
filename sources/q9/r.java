package q9;
public final class r {
    public final Class f41228a;
    public final Class f41229b;

    public r(Class cls, Class cls2) {
        this.f41228a = cls;
        this.f41229b = cls2;
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
        if (!this.f41229b.equals(rVar.f41229b)) {
            return false;
        }
        return this.f41228a.equals(rVar.f41228a);
    }

    public final int hashCode() {
        return this.f41228a.hashCode() + (this.f41229b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41229b;
        Class cls2 = this.f41228a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
