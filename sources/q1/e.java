package q1;

import kotlin.jvm.internal.j;
public final class e {
    public final String f53699a;

    public e(String name) {
        j.e(name, "name");
        this.f53699a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f53699a, ((e) obj).f53699a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53699a.hashCode();
    }

    public final String toString() {
        return this.f53699a;
    }
}
