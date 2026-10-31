package z9;
public final class s0 extends q1 {
    public final long f55386a;
    public final String f55387b;
    public final String f55388c;
    public final long d;
    public final int e;

    public s0(String str, int i10, String str2, long j10, long j11) {
        this.f55386a = j10;
        this.f55387b = str;
        this.f55388c = str2;
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
            String str2 = s0Var.f55388c;
            if (this.f55386a == s0Var.f55386a && this.f55387b.equals(s0Var.f55387b) && ((str = this.f55388c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.e == s0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f55386a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f55387b.hashCode()) * 1000003;
        String str = this.f55388c;
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
        sb2.append(this.f55386a);
        sb2.append(", symbol=");
        sb2.append(this.f55387b);
        sb2.append(", file=");
        sb2.append(this.f55388c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a1.g.p(sb2, this.e, "}");
    }
}
