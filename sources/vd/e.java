package vd;
public final class e extends f {
    public final Throwable f50792a;

    public e(Throwable th2) {
        this.f50792a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f50792a, ((e) obj).f50792a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f50792a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f50792a + ')';
    }
}
