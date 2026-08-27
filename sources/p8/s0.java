package p8;

import java.io.Serializable;

public final class s0 extends k0 implements Serializable {

    public final k0 f45585a;

    public s0(k0 k0Var) {
        this.f45585a = k0Var;
    }

    @Override
    public final k0 a() {
        return this.f45585a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f45585a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            return this.f45585a.equals(((s0) obj).f45585a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f45585a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f45585a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10);
        sb2.append(strValueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
