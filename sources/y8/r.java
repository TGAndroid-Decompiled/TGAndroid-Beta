package y8;
public final class r {
    public final Class f49656a;
    public final Class f49657b;

    public r(Class cls, Class cls2) {
        this.f49656a = cls;
        this.f49657b = cls2;
    }

    public static r a(Class cls) {
        return new r(q.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f49657b.equals(rVar.f49657b)) {
            return false;
        }
        return this.f49656a.equals(rVar.f49656a);
    }

    public final int hashCode() {
        return this.f49656a.hashCode() + (this.f49657b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f49657b;
        Class cls2 = this.f49656a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
