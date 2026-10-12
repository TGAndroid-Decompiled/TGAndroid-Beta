package x9;
public final class b extends l {
    public final String f51310b;
    public final String f51311c;
    public final String d;
    public final String f51312e;
    public final long f51313f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f51310b = str;
            if (str2 != null) {
                this.f51311c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f51312e = str4;
                        this.f51313f = j3;
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
            if (this.f51310b.equals(bVar.f51310b) && this.f51311c.equals(bVar.f51311c) && this.d.equals(bVar.d) && this.f51312e.equals(bVar.f51312e) && this.f51313f == bVar.f51313f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f51313f;
        return ((((((((this.f51310b.hashCode() ^ 1000003) * 1000003) ^ this.f51311c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f51312e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f51310b);
        sb2.append(", parameterKey=");
        sb2.append(this.f51311c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f51312e);
        sb2.append(", templateVersion=");
        return a1.g.s(sb2, this.f51313f, "}");
    }
}
