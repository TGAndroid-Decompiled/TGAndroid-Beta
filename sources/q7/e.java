package q7;
public final class e extends d {
    public final f7.x f56112a;

    public e(f7.x xVar) {
        this.f56112a = xVar;
    }

    @Override
    public final Object a() {
        return this.f56112a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f56112a.equals(((e) obj).f56112a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56112a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a8.p0.p("Optional.of(", this.f56112a.toString(), ")");
    }
}
