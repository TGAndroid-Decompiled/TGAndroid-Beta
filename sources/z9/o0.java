package z9;
public final class o0 extends n1 {
    public final long f50057a;
    public final long f50058b;
    public final String f50059c;
    public final String d;

    public o0(String str, long j10, long j11, String str2) {
        this.f50057a = j10;
        this.f50058b = j11;
        this.f50059c = str;
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
            if (this.f50057a == o0Var.f50057a && this.f50058b == o0Var.f50058b && this.f50059c.equals(o0Var.f50059c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f50057a;
        long j11 = this.f50058b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f50059c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f50057a);
        sb2.append(", size=");
        sb2.append(this.f50058b);
        sb2.append(", name=");
        sb2.append(this.f50059c);
        sb2.append(", uuid=");
        return a1.g.s(sb2, this.d, "}");
    }
}
