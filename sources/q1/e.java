package q1;

import kotlin.jvm.internal.j;
public final class e {
    public final String f53569a;

    public e(String name) {
        j.e(name, "name");
        this.f53569a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f53569a, ((e) obj).f53569a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53569a.hashCode();
    }

    public final String toString() {
        return this.f53569a;
    }
}
