package y6;

import java.util.Arrays;

public final class y0 extends c1 {

    public final long f49794a;

    public y0(long j10) {
        this.f49794a = j10;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        if (zza() != c1Var.zza()) {
            return zza() - c1Var.zza();
        }
        long jAbs = Math.abs(this.f49794a);
        long jAbs2 = Math.abs(((y0) c1Var).f49794a);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && y0.class == obj.getClass() && this.f49794a == ((y0) obj).f49794a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f49794a)});
    }

    public final String toString() {
        return Long.toString(this.f49794a);
    }

    @Override
    public final int zza() {
        return c1.c(this.f49794a >= 0 ? (byte) 0 : (byte) 32);
    }
}
