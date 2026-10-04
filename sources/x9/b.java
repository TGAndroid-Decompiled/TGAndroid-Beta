package x9;
public final class b extends l {
    public final String f49788b;
    public final String f49789c;
    public final String d;
    public final String f49790e;
    public final long f49791f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f49788b = str;
            if (str2 != null) {
                this.f49789c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f49790e = str4;
                        this.f49791f = j3;
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
            if (this.f49788b.equals(bVar.f49788b) && this.f49789c.equals(bVar.f49789c) && this.d.equals(bVar.d) && this.f49790e.equals(bVar.f49790e) && this.f49791f == bVar.f49791f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f49791f;
        return ((((((((this.f49788b.hashCode() ^ 1000003) * 1000003) ^ this.f49789c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f49790e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f49788b);
        sb2.append(", parameterKey=");
        sb2.append(this.f49789c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f49790e);
        sb2.append(", templateVersion=");
        return a4.a.s(sb2, this.f49791f, "}");
    }
}
