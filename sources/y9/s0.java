package y9;
public final class s0 extends q1 {
    public final long f50775a;
    public final String f50776b;
    public final String f50777c;
    public final long d;
    public final int f50778e;

    public s0(long j3, String str, String str2, long j10, int i10) {
        this.f50775a = j3;
        this.f50776b = str;
        this.f50777c = str2;
        this.d = j10;
        this.f50778e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f50777c;
            if (this.f50775a == s0Var.f50775a && this.f50776b.equals(s0Var.f50776b) && ((str = this.f50777c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f50778e == s0Var.f50778e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f50775a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f50776b.hashCode()) * 1000003;
        String str = this.f50777c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return this.f50778e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f50775a);
        sb2.append(", symbol=");
        sb2.append(this.f50776b);
        sb2.append(", file=");
        sb2.append(this.f50777c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a4.a.o(this.f50778e, "}", sb2);
    }
}
