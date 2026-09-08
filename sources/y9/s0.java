package y9;
public final class s0 extends q1 {
    public final long f49907a;
    public final String f49908b;
    public final String f49909c;
    public final long d;
    public final int f49910e;

    public s0(long j3, String str, String str2, long j10, int i10) {
        this.f49907a = j3;
        this.f49908b = str;
        this.f49909c = str2;
        this.d = j10;
        this.f49910e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f49909c;
            if (this.f49907a == s0Var.f49907a && this.f49908b.equals(s0Var.f49908b) && ((str = this.f49909c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f49910e == s0Var.f49910e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49907a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f49908b.hashCode()) * 1000003;
        String str = this.f49909c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return this.f49910e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f49907a);
        sb2.append(", symbol=");
        sb2.append(this.f49908b);
        sb2.append(", file=");
        sb2.append(this.f49909c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a4.a.n(this.f49910e, "}", sb2);
    }
}
