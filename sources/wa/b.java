package wa;

import o1.g;
public final class b {
    public final String f57432a;
    public final long f57433b;
    public final int f57434c;

    public b(String str, long j10, int i3) {
        this.f57432a = str;
        this.f57433b = j10;
        this.f57434c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i3 = bVar.f57434c;
                String str = bVar.f57432a;
                String str2 = this.f57432a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f57433b == bVar.f57433b) {
                    int i10 = this.f57434c;
                    if (i10 == 0) {
                        if (i3 == 0) {
                            return true;
                        }
                        return false;
                    } else if (g.b(i10, i3)) {
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
        int i3 = 0;
        String str = this.f57432a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f57433b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i11 = this.f57434c;
        if (i11 != 0) {
            i3 = g.c(i11);
        }
        return i3 ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f57432a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f57433b);
        sb2.append(", responseCode=");
        int i3 = this.f57434c;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
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
