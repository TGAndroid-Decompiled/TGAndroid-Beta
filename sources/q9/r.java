package q9;
public final class r {
    public final Class f46041a;
    public final Class f46042b;

    public r(Class cls, Class cls2) {
        this.f46041a = cls;
        this.f46042b = cls2;
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
        if (!this.f46042b.equals(rVar.f46042b)) {
            return false;
        }
        return this.f46041a.equals(rVar.f46041a);
    }

    public final int hashCode() {
        return this.f46041a.hashCode() + (this.f46042b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f46042b;
        Class cls2 = this.f46041a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
