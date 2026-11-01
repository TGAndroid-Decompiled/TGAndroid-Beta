package vd;
public final class e extends f {
    public final Throwable f50806a;

    public e(Throwable th2) {
        this.f50806a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f50806a, ((e) obj).f50806a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f50806a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f50806a + ')';
    }
}
