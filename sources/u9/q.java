package u9;
public final class q {
    public final Class f58571a;
    public final Class f58572b;

    public q(Class cls, Class cls2) {
        this.f58571a = cls;
        this.f58572b = cls2;
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
        if (!this.f58572b.equals(qVar.f58572b)) {
            return false;
        }
        return this.f58571a.equals(qVar.f58571a);
    }

    public final int hashCode() {
        return this.f58571a.hashCode() + (this.f58572b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f58572b;
        Class cls2 = this.f58571a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
