package p7;

import java.util.Arrays;
public final class w0 extends d1 {
    public final boolean f53415a;

    public w0(boolean z10) {
        this.f53415a = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        int i3;
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c2 = d1.c((byte) -32);
        if (c2 != zza) {
            return c2 - d1Var.zza();
        }
        w0 w0Var = (w0) d1Var;
        int i10 = 21;
        if (true != this.f53415a) {
            i3 = 20;
        } else {
            i3 = 21;
        }
        if (true != w0Var.f53415a) {
            i10 = 20;
        }
        return i3 - i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass() && this.f53415a == ((w0) obj).f53415a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) -32)), Boolean.valueOf(this.f53415a)});
    }

    public final String toString() {
        return Boolean.toString(this.f53415a);
    }

    @Override
    public final int zza() {
        return d1.c((byte) -32);
    }
}
