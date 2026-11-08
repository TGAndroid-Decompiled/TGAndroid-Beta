package xa;

import p1.g;
public final class b {
    public final String f58672a;
    public final long f58673b;
    public final int f58674c;

    public b(String str, long j3, int i7) {
        this.f58672a = str;
        this.f58673b = j3;
        this.f58674c = i7;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i7 = bVar.f58674c;
                String str = bVar.f58672a;
                String str2 = this.f58672a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f58673b == bVar.f58673b) {
                    int i10 = this.f58674c;
                    if (i10 == 0) {
                        if (i7 == 0) {
                            return true;
                        }
                        return false;
                    } else if (g.b(i10, i7)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        String str = this.f58672a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.f58673b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i11 = this.f58674c;
        if (i11 != 0) {
            i7 = g.c(i11);
        }
        return i7 ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f58672a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f58673b);
        sb2.append(", responseCode=");
        int i7 = this.f58674c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    str = "null";
                } else {
                    str = "AUTH_ERROR";
                }
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
