package yd;
public final class h extends i {
    public final Throwable f59408a;

    public h(Throwable th2) {
        this.f59408a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (kotlin.jvm.internal.j.a(this.f59408a, ((h) obj).f59408a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f59408a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f59408a + ')';
    }
}
