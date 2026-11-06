package u9;
public final class q {
    public final Class f56371a;
    public final Class f56372b;

    public q(Class cls, Class cls2) {
        this.f56371a = cls;
        this.f56372b = cls2;
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
        if (!this.f56372b.equals(qVar.f56372b)) {
            return false;
        }
        return this.f56371a.equals(qVar.f56371a);
    }

    public final int hashCode() {
        return this.f56371a.hashCode() + (this.f56372b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f56372b;
        Class cls2 = this.f56371a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
