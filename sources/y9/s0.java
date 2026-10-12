package y9;
public final class s0 extends q1 {
    public final long f52280a;
    public final String f52281b;
    public final String f52282c;
    public final long d;
    public final int f52283e;

    public s0(long j3, String str, String str2, long j10, int i10) {
        this.f52280a = j3;
        this.f52281b = str;
        this.f52282c = str2;
        this.d = j10;
        this.f52283e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f52282c;
            if (this.f52280a == s0Var.f52280a && this.f52281b.equals(s0Var.f52281b) && ((str = this.f52282c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f52283e == s0Var.f52283e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52280a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f52281b.hashCode()) * 1000003;
        String str = this.f52282c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f52283e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f52280a);
        sb2.append(", symbol=");
        sb2.append(this.f52281b);
        sb2.append(", file=");
        sb2.append(this.f52282c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a1.g.o(this.f52283e, "}", sb2);
    }
}
