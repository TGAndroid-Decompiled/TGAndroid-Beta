package q1;

import kotlin.jvm.internal.j;
public final class e {
    public final String f55754a;

    public e(String name) {
        j.e(name, "name");
        this.f55754a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f55754a, ((e) obj).f55754a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55754a.hashCode();
    }

    public final String toString() {
        return this.f55754a;
    }
}
