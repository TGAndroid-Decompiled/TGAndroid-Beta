package z9;
public final class o0 extends n1 {
    public final long f51462a;
    public final long f51463b;
    public final String f51464c;
    public final String d;

    public o0(String str, long j10, long j11, String str2) {
        this.f51462a = j10;
        this.f51463b = j11;
        this.f51464c = str;
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
            if (this.f51462a == o0Var.f51462a && this.f51463b == o0Var.f51463b && this.f51464c.equals(o0Var.f51464c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f51462a;
        long j11 = this.f51463b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f51464c.hashCode()) * 1000003;
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
        sb2.append(this.f51462a);
        sb2.append(", size=");
        sb2.append(this.f51463b);
        sb2.append(", name=");
        sb2.append(this.f51464c);
        sb2.append(", uuid=");
        return a1.g.s(sb2, this.d, "}");
    }
}
