package y9;
public final class s0 extends q1 {
    public final long f49908a;
    public final String f49909b;
    public final String f49910c;
    public final long d;
    public final int f49911e;

    public s0(long j3, String str, String str2, long j10, int i10) {
        this.f49908a = j3;
        this.f49909b = str;
        this.f49910c = str2;
        this.d = j10;
        this.f49911e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f49910c;
            if (this.f49908a == s0Var.f49908a && this.f49909b.equals(s0Var.f49909b) && ((str = this.f49910c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f49911e == s0Var.f49911e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f49908a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f49909b.hashCode()) * 1000003;
        String str = this.f49910c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        return this.f49911e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f49908a);
        sb2.append(", symbol=");
        sb2.append(this.f49909b);
        sb2.append(", file=");
        sb2.append(this.f49910c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return a4.a.n(this.f49911e, "}", sb2);
    }
}
