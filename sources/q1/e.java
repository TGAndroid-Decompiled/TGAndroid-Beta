package q1;

import kotlin.jvm.internal.j;
public final class e {
    public final String f53687a;

    public e(String name) {
        j.e(name, "name");
        this.f53687a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return j.a(this.f53687a, ((e) obj).f53687a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53687a.hashCode();
    }

    public final String toString() {
        return this.f53687a;
    }
}
