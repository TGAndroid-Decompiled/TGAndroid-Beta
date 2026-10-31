package z9;
public final class o0 extends n1 {
    public final long f55359a;
    public final long f55360b;
    public final String f55361c;
    public final String d;

    public o0(String str, String str2, long j10, long j11) {
        this.f55359a = j10;
        this.f55360b = j11;
        this.f55361c = str;
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
            if (this.f55359a == o0Var.f55359a && this.f55360b == o0Var.f55360b && this.f55361c.equals(o0Var.f55361c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f55359a;
        long j11 = this.f55360b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f55361c.hashCode()) * 1000003;
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
        sb2.append(this.f55359a);
        sb2.append(", size=");
        sb2.append(this.f55360b);
        sb2.append(", name=");
        sb2.append(this.f55361c);
        sb2.append(", uuid=");
        return a1.g.r(sb2, this.d, "}");
    }
}
