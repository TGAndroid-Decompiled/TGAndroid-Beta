package s9;
public final class r {
    public final Class f48012a;
    public final Class f48013b;

    public r(Class cls, Class cls2) {
        this.f48012a = cls;
        this.f48013b = cls2;
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
        if (!this.f48013b.equals(rVar.f48013b)) {
            return false;
        }
        return this.f48012a.equals(rVar.f48012a);
    }

    public final int hashCode() {
        return this.f48012a.hashCode() + (this.f48013b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f48013b;
        Class cls2 = this.f48012a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
