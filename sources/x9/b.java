package x9;
public final class b extends l {
    public final String f49795b;
    public final String f49796c;
    public final String d;
    public final String f49797e;
    public final long f49798f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f49795b = str;
            if (str2 != null) {
                this.f49796c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f49797e = str4;
                        this.f49798f = j3;
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
            if (this.f49795b.equals(bVar.f49795b) && this.f49796c.equals(bVar.f49796c) && this.d.equals(bVar.d) && this.f49797e.equals(bVar.f49797e) && this.f49798f == bVar.f49798f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f49798f;
        return ((((((((this.f49795b.hashCode() ^ 1000003) * 1000003) ^ this.f49796c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f49797e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f49795b);
        sb2.append(", parameterKey=");
        sb2.append(this.f49796c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f49797e);
        sb2.append(", templateVersion=");
        return a4.a.s(sb2, this.f49798f, "}");
    }
}
