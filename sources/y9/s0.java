package y9;
public final class s0 extends q1 {
    public final long f52100a;
    public final String f52101b;
    public final String f52102c;
    public final long d;
    public final int f52103e;

    public s0(long j3, String str, String str2, long j10, int i10) {
        this.f52100a = j3;
        this.f52101b = str;
        this.f52102c = str2;
        this.d = j10;
        this.f52103e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f52102c;
            if (this.f52100a == s0Var.f52100a && this.f52101b.equals(s0Var.f52101b) && ((str = this.f52102c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f52103e == s0Var.f52103e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f52100a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f52101b.hashCode()) * 1000003;
        String str = this.f52102c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f52103e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f52100a);
        sb2.append(", symbol=");
        sb2.append(this.f52101b);
        sb2.append(", file=");
        sb2.append(this.f52102c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a1.g.o(this.f52103e, "}", sb2);
    }
}
