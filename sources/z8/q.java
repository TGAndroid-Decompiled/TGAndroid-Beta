package z8;

public final class q {

    public final Class f50252a;

    public final Class f50253b;

    public q(Class cls, Class cls2) {
        this.f50252a = cls;
        this.f50253b = cls2;
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
        if (this.f50253b.equals(qVar.f50253b)) {
            return this.f50252a.equals(qVar.f50252a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50252a.hashCode() + (this.f50253b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f50253b;
        Class cls2 = this.f50252a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
