package q1;

import kotlin.jvm.internal.j;
public final class e {
    public final String f55709a;

    public e(String name) {
        j.e(name, "name");
        this.f55709a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f55709a, ((e) obj).f55709a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55709a.hashCode();
    }

    public final String toString() {
        return this.f55709a;
    }
}
