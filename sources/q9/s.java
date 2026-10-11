package q9;
public final class s {
    public final Class f46119a;
    public final Class f46120b;

    public s(Class cls, Class cls2) {
        this.f46119a = cls;
        this.f46120b = cls2;
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
        if (!this.f46120b.equals(sVar.f46120b)) {
            return false;
        }
        return this.f46119a.equals(sVar.f46119a);
    }

    public final int hashCode() {
        return this.f46119a.hashCode() + (this.f46120b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f46120b;
        Class cls2 = this.f46119a;
        if (cls2 == r.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
