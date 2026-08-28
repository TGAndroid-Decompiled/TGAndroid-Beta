package x6;
public final class e extends d {
    public final m6.x f49002a;

    public e(m6.x xVar) {
        this.f49002a = xVar;
    }

    @Override
    public final Object a() {
        return this.f49002a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f49002a.equals(((e) obj).f49002a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49002a.hashCode() + 1502476572;
    }

    public final String toString() {
        return aa.d.o("Optional.of(", this.f49002a.toString(), ")");
    }
}
