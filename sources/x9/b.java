package x9;
public final class b extends l {
    public final String f51117b;
    public final String f51118c;
    public final String d;
    public final String f51119e;
    public final long f51120f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f51117b = str;
            if (str2 != null) {
                this.f51118c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f51119e = str4;
                        this.f51120f = j3;
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
            if (this.f51117b.equals(bVar.f51117b) && this.f51118c.equals(bVar.f51118c) && this.d.equals(bVar.d) && this.f51119e.equals(bVar.f51119e) && this.f51120f == bVar.f51120f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f51120f;
        return ((((((((this.f51117b.hashCode() ^ 1000003) * 1000003) ^ this.f51118c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f51119e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f51117b);
        sb2.append(", parameterKey=");
        sb2.append(this.f51118c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f51119e);
        sb2.append(", templateVersion=");
        return a1.g.s(sb2, this.f51120f, "}");
    }
}
