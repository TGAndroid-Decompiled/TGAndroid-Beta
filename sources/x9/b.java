package x9;
public final class b extends l {
    public final String f45656b;
    public final String f45657c;
    public final String d;
    public final String e;
    public final long f45658f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f45656b = str;
            if (str2 != null) {
                this.f45657c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.e = str4;
                        this.f45658f = j3;
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
            if (this.f45656b.equals(bVar.f45656b) && this.f45657c.equals(bVar.f45657c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f45658f == bVar.f45658f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45658f;
        return ((((((((this.f45656b.hashCode() ^ 1000003) * 1000003) ^ this.f45657c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f45656b);
        sb2.append(", parameterKey=");
        sb2.append(this.f45657c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.e);
        sb2.append(", templateVersion=");
        return a4.a.s(sb2, this.f45658f, "}");
    }
}
