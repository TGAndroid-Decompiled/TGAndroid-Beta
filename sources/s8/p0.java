package s8;

import java.io.Serializable;
public final class p0 extends h0 implements Serializable {
    public final h0 f44145a;

    public p0(h0 h0Var) {
        this.f44145a = h0Var;
    }

    @Override
    public final h0 a() {
        return this.f44145a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f44145a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            return this.f44145a.equals(((p0) obj).f44145a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f44145a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f44145a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
