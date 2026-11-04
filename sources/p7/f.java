package p7;
public final class f extends e {
    public final e7.x f53349a;

    public f(e7.x xVar) {
        this.f53349a = xVar;
    }

    @Override
    public final Object a() {
        return this.f53349a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f53349a.equals(((f) obj).f53349a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53349a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.q("Optional.of(", this.f53349a.toString(), ")");
    }
}
