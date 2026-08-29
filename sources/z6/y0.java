package z6;

import java.util.Arrays;
public final class y0 extends c1 {
    public final long f50777a;

    public y0(long j10) {
        this.f50777a = j10;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        if (zza() != c1Var.zza()) {
            return zza() - c1Var.zza();
        }
        int i10 = (Math.abs(this.f50777a) > Math.abs(((y0) c1Var).f50777a) ? 1 : (Math.abs(this.f50777a) == Math.abs(((y0) c1Var).f50777a) ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 > 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass() && this.f50777a == ((y0) obj).f50777a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f50777a)});
    }

    public final String toString() {
        return Long.toString(this.f50777a);
    }

    @Override
    public final int zza() {
        byte b10;
        if (this.f50777a >= 0) {
            b10 = 0;
        } else {
            b10 = 32;
        }
        return c1.c(b10);
    }
}
