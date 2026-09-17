package y9;
public final class s0 extends q1 {
    public final long f49879a;
    public final String f49880b;
    public final String f49881c;
    public final long d;
    public final int f49882e;

    public s0(long j3, String str, String str2, long j10, int i10) {
        this.f49879a = j3;
        this.f49880b = str;
        this.f49881c = str2;
        this.d = j10;
        this.f49882e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f49881c;
            if (this.f49879a == s0Var.f49879a && this.f49880b.equals(s0Var.f49880b) && ((str = this.f49881c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f49882e == s0Var.f49882e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49879a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f49880b.hashCode()) * 1000003;
        String str = this.f49881c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return this.f49882e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f49879a);
        sb2.append(", symbol=");
        sb2.append(this.f49880b);
        sb2.append(", file=");
        sb2.append(this.f49881c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a4.a.n(this.f49882e, "}", sb2);
    }
}
