package y9;
public final class b extends l {
    public final String f54323b;
    public final String f54324c;
    public final String d;
    public final String e;
    public final long f54325f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f54323b = str;
            if (str2 != null) {
                this.f54324c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.e = str4;
                        this.f54325f = j10;
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
            if (this.f54323b.equals(bVar.f54323b) && this.f54324c.equals(bVar.f54324c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f54325f == bVar.f54325f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f54325f;
        return ((((((((this.f54323b.hashCode() ^ 1000003) * 1000003) ^ this.f54324c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f54323b);
        sb2.append(", parameterKey=");
        sb2.append(this.f54324c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.e);
        sb2.append(", templateVersion=");
        return a1.g.q(sb2, this.f54325f, "}");
    }
}
