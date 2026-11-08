package q7;
public final class e extends d {
    public final f7.x f53967a;

    public e(f7.x xVar) {
        this.f53967a = xVar;
    }

    @Override
    public final Object a() {
        return this.f53967a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f53967a.equals(((e) obj).f53967a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53967a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a8.p0.p("Optional.of(", this.f53967a.toString(), ")");
    }
}
