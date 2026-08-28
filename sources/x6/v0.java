package x6;

import java.util.Arrays;
public final class v0 extends c1 {
    public final boolean f49068a;

    public v0(boolean z10) {
        this.f49068a = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        int i9;
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) -32);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        v0 v0Var = (v0) c1Var;
        int i10 = 21;
        if (true != this.f49068a) {
            i9 = 20;
        } else {
            i9 = 21;
        }
        if (true != v0Var.f49068a) {
            i10 = 20;
        }
        return i9 - i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass() && this.f49068a == ((v0) obj).f49068a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -32)), Boolean.valueOf(this.f49068a)});
    }

    public final String toString() {
        return Boolean.toString(this.f49068a);
    }

    @Override
    public final int zza() {
        return c1.c((byte) -32);
    }
}
