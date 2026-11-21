package q1;

import kotlin.jvm.internal.j;
public final class e {
    public final String f55750a;

    public e(String name) {
        j.e(name, "name");
        this.f55750a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f55750a, ((e) obj).f55750a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55750a.hashCode();
    }

    public final String toString() {
        return this.f55750a;
    }
}
