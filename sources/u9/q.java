package u9;
public final class q {
    public final Class f58686a;
    public final Class f58687b;

    public q(Class cls, Class cls2) {
        this.f58686a = cls;
        this.f58687b = cls2;
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
        if (!this.f58687b.equals(qVar.f58687b)) {
            return false;
        }
        return this.f58686a.equals(qVar.f58686a);
    }

    public final int hashCode() {
        return this.f58686a.hashCode() + (this.f58687b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f58687b;
        Class cls2 = this.f58686a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
