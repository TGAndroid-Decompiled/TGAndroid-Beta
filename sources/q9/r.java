package q9;
public final class r {
    public final Class f41481a;
    public final Class f41482b;

    public r(Class cls, Class cls2) {
        this.f41481a = cls;
        this.f41482b = cls2;
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
        if (!this.f41482b.equals(rVar.f41482b)) {
            return false;
        }
        return this.f41481a.equals(rVar.f41481a);
    }

    public final int hashCode() {
        return this.f41481a.hashCode() + (this.f41482b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41482b;
        Class cls2 = this.f41481a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
