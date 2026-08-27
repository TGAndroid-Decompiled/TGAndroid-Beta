package y6;

import java.util.Arrays;

public final class a1 extends c1 {

    public final String f49715a;

    public a1(String str) {
        this.f49715a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iZza = c1Var.zza();
        int iC = c1.c((byte) 96);
        if (iC != iZza) {
            return iC - c1Var.zza();
        }
        String str = ((a1) c1Var).f49715a;
        int length = str.length();
        String str2 = this.f49715a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            return this.f49715a.equals(((a1) obj).f49715a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) 96)), this.f49715a});
    }

    public final String toString() {
        return a9.p.p(new StringBuilder("\""), this.f49715a, "\"");
    }

    @Override
    public final int zza() {
        return c1.c((byte) 96);
    }
}
