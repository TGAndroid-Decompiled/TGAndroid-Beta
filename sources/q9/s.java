package q9;
public final class s {
    public final Class f41530a;
    public final Class f41531b;

    public s(Class cls, Class cls2) {
        this.f41530a = cls;
        this.f41531b = cls2;
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
        if (!this.f41531b.equals(sVar.f41531b)) {
            return false;
        }
        return this.f41530a.equals(sVar.f41530a);
    }

    public final int hashCode() {
        return this.f41530a.hashCode() + (this.f41531b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41531b;
        Class cls2 = this.f41530a;
        if (cls2 == r.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
