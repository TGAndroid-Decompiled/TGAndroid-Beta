package s9;
public final class s {
    public final Class f48053a;
    public final Class f48054b;

    public s(Class cls, Class cls2) {
        this.f48053a = cls;
        this.f48054b = cls2;
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
        if (!this.f48054b.equals(sVar.f48054b)) {
            return false;
        }
        return this.f48053a.equals(sVar.f48053a);
    }

    public final int hashCode() {
        return this.f48053a.hashCode() + (this.f48054b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f48054b;
        Class cls2 = this.f48053a;
        if (cls2 == r.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
