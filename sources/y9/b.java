package y9;
public final class b extends l {
    public final String f50089b;
    public final String f50090c;
    public final String d;
    public final String e;
    public final long f50091f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f50089b = str;
            if (str2 != null) {
                this.f50090c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.e = str4;
                        this.f50091f = j10;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            b bVar = (b) ((l) obj);
            if (this.f50089b.equals(bVar.f50089b) && this.f50090c.equals(bVar.f50090c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f50091f == bVar.f50091f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f50091f;
        return ((((((((this.f50089b.hashCode() ^ 1000003) * 1000003) ^ this.f50090c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f50089b);
        sb2.append(", parameterKey=");
        sb2.append(this.f50090c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.e);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.f50091f, "}");
    }
}
