package q7;

import java.util.Arrays;
public final class a1 extends c1 {
    public final String f55985a;

    public a1(String str) {
        this.f55985a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) 96);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        String str = ((a1) c1Var).f55985a;
        int length = str.length();
        String str2 = this.f55985a;
        if (str2.length() != length) {
            return str2.length() - str.length();
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        return this.f55985a.equals(((a1) obj).f55985a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) 96)), this.f55985a});
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("\""), this.f55985a, "\"");
    }

    @Override
    public final int zza() {
        return c1.c((byte) 96);
    }
}
