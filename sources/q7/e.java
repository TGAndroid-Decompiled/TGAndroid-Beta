package q7;
public final class e extends d {
    public final f7.x f55415a;

    public e(f7.x xVar) {
        this.f55415a = xVar;
    }

    @Override
    public final Object a() {
        return this.f55415a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f55415a.equals(((e) obj).f55415a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55415a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a8.p0.p("Optional.of(", this.f55415a.toString(), ")");
    }
}
