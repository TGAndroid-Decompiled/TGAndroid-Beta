package u9;
public final class q {
    public final Class f56395a;
    public final Class f56396b;

    public q(Class cls, Class cls2) {
        this.f56395a = cls;
        this.f56396b = cls2;
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
        if (!this.f56396b.equals(qVar.f56396b)) {
            return false;
        }
        return this.f56395a.equals(qVar.f56395a);
    }

    public final int hashCode() {
        return this.f56395a.hashCode() + (this.f56396b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f56396b;
        Class cls2 = this.f56395a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
