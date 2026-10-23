package r9;
public final class r {
    public final Class f45162a;
    public final Class f45163b;

    public r(Class cls, Class cls2) {
        this.f45162a = cls;
        this.f45163b = cls2;
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
        if (!this.f45163b.equals(rVar.f45163b)) {
            return false;
        }
        return this.f45162a.equals(rVar.f45162a);
    }

    public final int hashCode() {
        return this.f45162a.hashCode() + (this.f45163b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f45163b;
        Class cls2 = this.f45162a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
