package z6;

import java.util.Arrays;
public final class v0 extends c1 {
    public final boolean f50768a;

    public v0(boolean z10) {
        this.f50768a = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        int i10;
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c3 = c1.c((byte) -32);
        if (c3 != zza) {
            return c3 - c1Var.zza();
        }
        v0 v0Var = (v0) c1Var;
        int i11 = 21;
        if (true != this.f50768a) {
            i10 = 20;
        } else {
            i10 = 21;
        }
        if (true != v0Var.f50768a) {
            i11 = 20;
        }
        return i10 - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass() && this.f50768a == ((v0) obj).f50768a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -32)), Boolean.valueOf(this.f50768a)});
    }

    public final String toString() {
        return Boolean.toString(this.f50768a);
    }

    @Override
    public final int zza() {
        return c1.c((byte) -32);
    }
}
