package x9;
public final class b extends l {
    public final String f49298b;
    public final String f49299c;
    public final String d;
    public final String f49300e;
    public final long f49301f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f49298b = str;
            if (str2 != null) {
                this.f49299c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f49300e = str4;
                        this.f49301f = j3;
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
            if (this.f49298b.equals(bVar.f49298b) && this.f49299c.equals(bVar.f49299c) && this.d.equals(bVar.d) && this.f49300e.equals(bVar.f49300e) && this.f49301f == bVar.f49301f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f49301f;
        return ((((((((this.f49298b.hashCode() ^ 1000003) * 1000003) ^ this.f49299c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f49300e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f49298b);
        sb2.append(", parameterKey=");
        sb2.append(this.f49299c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f49300e);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.f49301f, "}");
    }
}
