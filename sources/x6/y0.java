package x6;

import java.util.Arrays;
public final class y0 extends c1 {
    public final long f49077a;

    public y0(long j10) {
        this.f49077a = j10;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        if (zza() != c1Var.zza()) {
            return zza() - c1Var.zza();
        }
        int i9 = (Math.abs(this.f49077a) > Math.abs(((y0) c1Var).f49077a) ? 1 : (Math.abs(this.f49077a) == Math.abs(((y0) c1Var).f49077a) ? 0 : -1));
        if (i9 < 0) {
            return -1;
        }
        if (i9 > 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass() && this.f49077a == ((y0) obj).f49077a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f49077a)});
    }

    public final String toString() {
        return Long.toString(this.f49077a);
    }

    @Override
    public final int zza() {
        byte b10;
        if (this.f49077a >= 0) {
            b10 = 0;
        } else {
            b10 = 32;
        }
        return c1.c(b10);
    }
}
