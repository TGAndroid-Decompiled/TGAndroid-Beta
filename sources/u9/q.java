package u9;
public final class q {
    public final Class f56396a;
    public final Class f56397b;

    public q(Class cls, Class cls2) {
        this.f56396a = cls;
        this.f56397b = cls2;
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
        if (!this.f56397b.equals(qVar.f56397b)) {
            return false;
        }
        return this.f56396a.equals(qVar.f56396a);
    }

    public final int hashCode() {
        return this.f56396a.hashCode() + (this.f56397b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f56397b;
        Class cls2 = this.f56396a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
