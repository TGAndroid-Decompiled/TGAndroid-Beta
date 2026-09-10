package sa;

import m1.j;
public final class b {
    public final String f41818a;
    public final long f41819b;
    public final int f41820c;

    public b(String str, long j3, int i10) {
        this.f41818a = str;
        this.f41819b = j3;
        this.f41820c = i10;
    }

    public static a5.a a() {
        a5.a aVar = new a5.a((char) 0, 18);
        aVar.d = 0L;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = bVar.f41820c;
                String str = bVar.f41818a;
                String str2 = this.f41818a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f41819b == bVar.f41819b) {
                    int i11 = this.f41820c;
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
        String str = this.f41818a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.f41819b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i12 = this.f41820c;
        if (i12 != 0) {
            i10 = j.c(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f41818a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f41819b);
        sb2.append(", responseCode=");
        int i10 = this.f41820c;
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
