package y9;
public final class s0 extends q1 {
    public final long f46902a;
    public final String f46903b;
    public final String f46904c;
    public final long d;
    public final int e;

    public s0(long j3, String str, String str2, long j10, int i10) {
        this.f46902a = j3;
        this.f46903b = str;
        this.f46904c = str2;
        this.d = j10;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f46904c;
            if (this.f46902a == s0Var.f46902a && this.f46903b.equals(s0Var.f46903b) && ((str = this.f46904c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.e == s0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f46902a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46903b.hashCode()) * 1000003;
        String str = this.f46904c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return this.e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f46902a);
        sb2.append(", symbol=");
        sb2.append(this.f46903b);
        sb2.append(", file=");
        sb2.append(this.f46904c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a4.a.o(this.e, "}", sb2);
    }
}
