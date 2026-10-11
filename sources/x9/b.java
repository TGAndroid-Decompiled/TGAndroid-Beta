package x9;
public final class b extends l {
    public final String f51195b;
    public final String f51196c;
    public final String d;
    public final String f51197e;
    public final long f51198f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f51195b = str;
            if (str2 != null) {
                this.f51196c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f51197e = str4;
                        this.f51198f = j3;
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
            if (this.f51195b.equals(bVar.f51195b) && this.f51196c.equals(bVar.f51196c) && this.d.equals(bVar.d) && this.f51197e.equals(bVar.f51197e) && this.f51198f == bVar.f51198f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f51198f;
        return ((((((((this.f51195b.hashCode() ^ 1000003) * 1000003) ^ this.f51196c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f51197e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f51195b);
        sb2.append(", parameterKey=");
        sb2.append(this.f51196c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f51197e);
        sb2.append(", templateVersion=");
        return a1.g.s(sb2, this.f51198f, "}");
    }
}
