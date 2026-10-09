package sa;

import m1.j;
public final class b {
    public final String f47874a;
    public final long f47875b;
    public final int f47876c;

    public b(String str, long j3, int i10) {
        this.f47874a = str;
        this.f47875b = j3;
        this.f47876c = i10;
    }

    public static a5.a a() {
        a5.a aVar = new a5.a((char) 0, 19);
        aVar.d = 0L;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = bVar.f47876c;
                String str = bVar.f47874a;
                String str2 = this.f47874a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f47875b == bVar.f47875b) {
                    int i11 = this.f47876c;
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
        String str = this.f47874a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.f47875b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i12 = this.f47876c;
        if (i12 != 0) {
            i10 = j.c(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f47874a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f47875b);
        sb2.append(", responseCode=");
        int i10 = this.f47876c;
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
