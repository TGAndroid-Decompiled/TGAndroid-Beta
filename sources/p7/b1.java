package p7;

import java.util.Arrays;
public final class b1 extends d1 {
    public final String f53343a;

    public b1(String str) {
        this.f53343a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c2 = d1.c((byte) 96);
        if (c2 != zza) {
            return c2 - d1Var.zza();
        }
        String str = ((b1) d1Var).f53343a;
        int length = str.length();
        String str2 = this.f53343a;
        if (str2.length() != length) {
            return str2.length() - str.length();
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        return this.f53343a.equals(((b1) obj).f53343a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) 96)), this.f53343a});
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("\""), this.f53343a, "\"");
    }

    @Override
    public final int zza() {
        return d1.c((byte) 96);
    }
}
