package u9;
public final class q {
    public final Class f58606a;
    public final Class f58607b;

    public q(Class cls, Class cls2) {
        this.f58606a = cls;
        this.f58607b = cls2;
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
        if (!this.f58607b.equals(qVar.f58607b)) {
            return false;
        }
        return this.f58606a.equals(qVar.f58606a);
    }

    public final int hashCode() {
        return this.f58606a.hashCode() + (this.f58607b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f58607b;
        Class cls2 = this.f58606a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
