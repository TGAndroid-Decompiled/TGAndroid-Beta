package y9;
public final class o0 extends n1 {
    public final long f46596a;
    public final long f46597b;
    public final String f46598c;
    public final String d;

    public o0(String str, long j3, long j10, String str2) {
        this.f46596a = j3;
        this.f46597b = j10;
        this.f46598c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            o0 o0Var = (o0) ((n1) obj);
            String str2 = o0Var.d;
            if (this.f46596a == o0Var.f46596a && this.f46597b == o0Var.f46597b && this.f46598c.equals(o0Var.f46598c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f46596a;
        long j10 = this.f46597b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f46598c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f46596a);
        sb2.append(", size=");
        sb2.append(this.f46597b);
        sb2.append(", name=");
        sb2.append(this.f46598c);
        sb2.append(", uuid=");
        return a4.a.s(sb2, this.d, "}");
    }
}
