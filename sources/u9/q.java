package u9;
public final class q {
    public final Class f57995a;
    public final Class f57996b;

    public q(Class cls, Class cls2) {
        this.f57995a = cls;
        this.f57996b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f57996b.equals(qVar.f57996b)) {
            return false;
        }
        return this.f57995a.equals(qVar.f57995a);
    }

    public final int hashCode() {
        return this.f57995a.hashCode() + (this.f57996b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f57996b;
        Class cls2 = this.f57995a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
