package z9;
public final class s0 extends q1 {
    public final long f51478a;
    public final String f51479b;
    public final String f51480c;
    public final long d;
    public final int e;

    public s0(String str, int i10, String str2, long j10, long j11) {
        this.f51478a = j10;
        this.f51479b = str;
        this.f51480c = str2;
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
            String str2 = s0Var.f51480c;
            if (this.f51478a == s0Var.f51478a && this.f51479b.equals(s0Var.f51479b) && ((str = this.f51480c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.e == s0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f51478a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f51479b.hashCode()) * 1000003;
        String str = this.f51480c;
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
        sb2.append(this.f51478a);
        sb2.append(", symbol=");
        sb2.append(this.f51479b);
        sb2.append(", file=");
        sb2.append(this.f51480c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a1.g.n(this.e, "}", sb2);
    }
}
