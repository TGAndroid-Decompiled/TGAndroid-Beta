package x9;
public final class b extends l {
    public final String f45729b;
    public final String f45730c;
    public final String d;
    public final String e;
    public final long f45731f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f45729b = str;
            if (str2 != null) {
                this.f45730c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.e = str4;
                        this.f45731f = j3;
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
            if (this.f45729b.equals(bVar.f45729b) && this.f45730c.equals(bVar.f45730c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f45731f == bVar.f45731f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45731f;
        return ((((((((this.f45729b.hashCode() ^ 1000003) * 1000003) ^ this.f45730c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f45729b);
        sb2.append(", parameterKey=");
        sb2.append(this.f45730c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.e);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.f45731f, "}");
    }
}
