package ua;

import a8.ng;
import m1.j;
public final class b {
    public final String f49667a;
    public final long f49668b;
    public final int f49669c;

    public b(String str, long j10, int i10) {
        this.f49667a = str;
        this.f49668b = j10;
        this.f49669c = i10;
    }

    public static ng a() {
        ng ngVar = new ng((char) 0, 24);
        ngVar.d = 0L;
        return ngVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = bVar.f49669c;
                String str = bVar.f49667a;
                String str2 = this.f49667a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f49668b == bVar.f49668b) {
                    int i11 = this.f49669c;
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
        String str = this.f49667a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f49668b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i12 = this.f49669c;
        if (i12 != 0) {
            i10 = j.c(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f49667a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f49668b);
        sb2.append(", responseCode=");
        int i10 = this.f49669c;
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
