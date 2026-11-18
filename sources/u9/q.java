package u9;
public final class q {
    public final Class f58561a;
    public final Class f58562b;

    public q(Class cls, Class cls2) {
        this.f58561a = cls;
        this.f58562b = cls2;
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
        if (!this.f58562b.equals(qVar.f58562b)) {
            return false;
        }
        return this.f58561a.equals(qVar.f58561a);
    }

    public final int hashCode() {
        return this.f58561a.hashCode() + (this.f58562b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f58562b;
        Class cls2 = this.f58561a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
