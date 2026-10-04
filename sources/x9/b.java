package x9;
public final class b extends l {
    public final String f49779b;
    public final String f49780c;
    public final String d;
    public final String f49781e;
    public final long f49782f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f49779b = str;
            if (str2 != null) {
                this.f49780c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f49781e = str4;
                        this.f49782f = j3;
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
            if (this.f49779b.equals(bVar.f49779b) && this.f49780c.equals(bVar.f49780c) && this.d.equals(bVar.d) && this.f49781e.equals(bVar.f49781e) && this.f49782f == bVar.f49782f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f49782f;
        return ((((((((this.f49779b.hashCode() ^ 1000003) * 1000003) ^ this.f49780c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f49781e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f49779b);
        sb2.append(", parameterKey=");
        sb2.append(this.f49780c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f49781e);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.f49782f, "}");
    }
}
