package x9;
public final class b extends l {
    public final String f51302b;
    public final String f51303c;
    public final String d;
    public final String f51304e;
    public final long f51305f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f51302b = str;
            if (str2 != null) {
                this.f51303c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f51304e = str4;
                        this.f51305f = j3;
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
            if (this.f51302b.equals(bVar.f51302b) && this.f51303c.equals(bVar.f51303c) && this.d.equals(bVar.d) && this.f51304e.equals(bVar.f51304e) && this.f51305f == bVar.f51305f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f51305f;
        return ((((((((this.f51302b.hashCode() ^ 1000003) * 1000003) ^ this.f51303c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f51304e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f51302b);
        sb2.append(", parameterKey=");
        sb2.append(this.f51303c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f51304e);
        sb2.append(", templateVersion=");
        return a1.g.s(sb2, this.f51305f, "}");
    }
}
