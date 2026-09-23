package sa;

import m1.j;
public final class b {
    public final String f42835a;
    public final long f42836b;
    public final int f42837c;

    public b(String str, long j3, int i10) {
        this.f42835a = str;
        this.f42836b = j3;
        this.f42837c = i10;
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
                int i10 = bVar.f42837c;
                String str = bVar.f42835a;
                String str2 = this.f42835a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f42836b == bVar.f42836b) {
                    int i11 = this.f42837c;
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
        String str = this.f42835a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.f42836b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i12 = this.f42837c;
        if (i12 != 0) {
            i10 = j.c(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f42835a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f42836b);
        sb2.append(", responseCode=");
        int i10 = this.f42837c;
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
