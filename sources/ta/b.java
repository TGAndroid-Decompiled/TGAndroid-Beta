package ta;

import m1.j;
public final class b {
    public final String f48587a;
    public final long f48588b;
    public final int f48589c;

    public b(String str, long j10, int i10) {
        this.f48587a = str;
        this.f48588b = j10;
        this.f48589c = i10;
    }

    public static a5.a a() {
        a5.a aVar = new a5.a((char) 0, 21);
        aVar.d = 0L;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = bVar.f48589c;
                String str = bVar.f48587a;
                String str2 = this.f48587a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f48588b == bVar.f48588b) {
                    int i11 = this.f48589c;
                    if (i11 == 0) {
                        if (i10 == 0) {
                            return true;
                        }
                        return false;
                    } else if (j.b(i11, i10)) {
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
        int i10 = 0;
        String str = this.f48587a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f48588b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i12 = this.f48589c;
        if (i12 != 0) {
            i10 = j.c(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f48587a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f48588b);
        sb2.append(", responseCode=");
        int i10 = this.f48589c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
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
