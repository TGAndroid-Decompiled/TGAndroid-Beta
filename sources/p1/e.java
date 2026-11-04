package p1;

import kotlin.jvm.internal.j;
public final class e {
    public final String f53065a;

    public e(String name) {
        j.e(name, "name");
        this.f53065a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f53065a, ((e) obj).f53065a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53065a.hashCode();
    }

    public final String toString() {
        return this.f53065a;
    }
}
