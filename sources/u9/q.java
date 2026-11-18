package u9;
public final class q {
    public final Class f58560a;
    public final Class f58561b;

    public q(Class cls, Class cls2) {
        this.f58560a = cls;
        this.f58561b = cls2;
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
        if (!this.f58561b.equals(qVar.f58561b)) {
            return false;
        }
        return this.f58560a.equals(qVar.f58560a);
    }

    public final int hashCode() {
        return this.f58560a.hashCode() + (this.f58561b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f58561b;
        Class cls2 = this.f58560a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
