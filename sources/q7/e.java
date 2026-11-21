package q7;
public final class e extends d {
    public final f7.x f56030a;

    public e(f7.x xVar) {
        this.f56030a = xVar;
    }

    @Override
    public final Object a() {
        return this.f56030a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f56030a.equals(((e) obj).f56030a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56030a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a8.p0.p("Optional.of(", this.f56030a.toString(), ")");
    }
}
