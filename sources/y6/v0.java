package y6;

import java.util.Arrays;

public final class v0 extends c1 {

    public final boolean f49785a;

    public v0(boolean z10) {
        this.f49785a = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iZza = c1Var.zza();
        int iC = c1.c((byte) -32);
        if (iC != iZza) {
            return iC - c1Var.zza();
        }
        return (true != this.f49785a ? 20 : 21) - (true != ((v0) c1Var).f49785a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v0.class == obj.getClass() && this.f49785a == ((v0) obj).f49785a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -32)), Boolean.valueOf(this.f49785a)});
    }

    public final String toString() {
        return Boolean.toString(this.f49785a);
    }

    @Override
    public final int zza() {
        return c1.c((byte) -32);
    }
}
