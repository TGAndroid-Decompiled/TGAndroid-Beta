package q9;
public final class s {
    public final Class f41509a;
    public final Class f41510b;

    public s(Class cls, Class cls2) {
        this.f41509a = cls;
        this.f41510b = cls2;
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
        if (!this.f41510b.equals(sVar.f41510b)) {
            return false;
        }
        return this.f41509a.equals(sVar.f41509a);
    }

    public final int hashCode() {
        return this.f41509a.hashCode() + (this.f41510b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f41510b;
        Class cls2 = this.f41509a;
        if (cls2 == r.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
