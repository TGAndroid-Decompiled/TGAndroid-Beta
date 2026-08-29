package q8;

import java.io.Serializable;
public final class s0 extends k0 implements Serializable {
    public final k0 f46492a;

    public s0(k0 k0Var) {
        this.f46492a = k0Var;
    }

    @Override
    public final k0 a() {
        return this.f46492a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f46492a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            return this.f46492a.equals(((s0) obj).f46492a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f46492a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46492a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
