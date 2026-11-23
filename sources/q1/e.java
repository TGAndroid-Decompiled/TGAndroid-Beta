package q1;

import kotlin.jvm.internal.j;
public final class e {
    public final String f55719a;

    public e(String name) {
        j.e(name, "name");
        this.f55719a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f55719a, ((e) obj).f55719a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55719a.hashCode();
    }

    public final String toString() {
        return this.f55719a;
    }
}
