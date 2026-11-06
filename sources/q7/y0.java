package q7;

import java.util.Arrays;
public final class y0 extends c1 {
    public final long f53948a;

    public y0(long j3) {
        this.f53948a = j3;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        if (zza() != c1Var.zza()) {
            return zza() - c1Var.zza();
        }
        int i7 = (Math.abs(this.f53948a) > Math.abs(((y0) c1Var).f53948a) ? 1 : (Math.abs(this.f53948a) == Math.abs(((y0) c1Var).f53948a) ? 0 : -1));
        if (i7 < 0) {
            return -1;
        }
        if (i7 > 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass() && this.f53948a == ((y0) obj).f53948a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f53948a)});
    }

    public final String toString() {
        return Long.toString(this.f53948a);
    }

    @Override
    public final int zza() {
        byte b10;
        if (this.f53948a >= 0) {
            b10 = 0;
        } else {
            b10 = 32;
        }
        return c1.c(b10);
    }
}
