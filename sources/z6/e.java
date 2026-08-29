package z6;
public final class e extends d {
    public final o6.x f50702a;

    public e(o6.x xVar) {
        this.f50702a = xVar;
    }

    @Override
    public final Object a() {
        return this.f50702a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f50702a.equals(((e) obj).f50702a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50702a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.w.n("Optional.of(", this.f50702a.toString(), ")");
    }
}
