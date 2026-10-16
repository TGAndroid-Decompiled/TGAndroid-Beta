package z9;
public final class s0 extends q1 {
    public final long f50084a;
    public final String f50085b;
    public final String f50086c;
    public final long d;
    public final int e;

    public s0(long j10, String str, String str2, long j11, int i10) {
        this.f50084a = j10;
        this.f50085b = str;
        this.f50086c = str2;
        this.d = j11;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f50086c;
            if (this.f50084a == s0Var.f50084a && this.f50085b.equals(s0Var.f50085b) && ((str = this.f50086c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.e == s0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f50084a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f50085b.hashCode()) * 1000003;
        String str = this.f50086c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f50084a);
        sb2.append(", symbol=");
        sb2.append(this.f50085b);
        sb2.append(", file=");
        sb2.append(this.f50086c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a1.g.n(this.e, "}", sb2);
    }
}
