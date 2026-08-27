package y6;

public final class e extends d {

    public final n6.x f49719a;

    public e(n6.x xVar) {
        this.f49719a = xVar;
    }

    @Override
    public final Object a() {
        return this.f49719a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f49719a.equals(((e) obj).f49719a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49719a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a9.p.m("Optional.of(", this.f49719a.toString(), ")");
    }
}
