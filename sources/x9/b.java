package x9;
public final class b extends l {
    public final String f51161b;
    public final String f51162c;
    public final String d;
    public final String f51163e;
    public final long f51164f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f51161b = str;
            if (str2 != null) {
                this.f51162c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f51163e = str4;
                        this.f51164f = j3;
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
            if (this.f51161b.equals(bVar.f51161b) && this.f51162c.equals(bVar.f51162c) && this.d.equals(bVar.d) && this.f51163e.equals(bVar.f51163e) && this.f51164f == bVar.f51164f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f51164f;
        return ((((((((this.f51161b.hashCode() ^ 1000003) * 1000003) ^ this.f51162c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f51163e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f51161b);
        sb2.append(", parameterKey=");
        sb2.append(this.f51162c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f51163e);
        sb2.append(", templateVersion=");
        return a1.g.s(sb2, this.f51164f, "}");
    }
}
