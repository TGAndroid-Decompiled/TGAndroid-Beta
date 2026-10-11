package q9;
public final class s {
    public final Class f46153a;
    public final Class f46154b;

    public s(Class cls, Class cls2) {
        this.f46153a = cls;
        this.f46154b = cls2;
    }

    public static s a(Class cls) {
        return new s(r.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.f46154b.equals(sVar.f46154b)) {
            return false;
        }
        return this.f46153a.equals(sVar.f46153a);
    }

    public final int hashCode() {
        return this.f46153a.hashCode() + (this.f46154b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f46154b;
        Class cls2 = this.f46153a;
        if (cls2 == r.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
