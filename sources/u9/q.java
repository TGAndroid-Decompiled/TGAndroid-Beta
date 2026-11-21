package u9;
public final class q {
    public final Class f58602a;
    public final Class f58603b;

    public q(Class cls, Class cls2) {
        this.f58602a = cls;
        this.f58603b = cls2;
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
        if (!this.f58603b.equals(qVar.f58603b)) {
            return false;
        }
        return this.f58602a.equals(qVar.f58602a);
    }

    public final int hashCode() {
        return this.f58602a.hashCode() + (this.f58603b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f58603b;
        Class cls2 = this.f58602a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
