package z2;

import m1.j;
public final class a {
    public final int f50994a;
    public final long f50995b;

    public a(int i10, long j10) {
        if (i10 != 0) {
            this.f50994a = i10;
            this.f50995b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (j.b(this.f50994a, aVar.f50994a) && this.f50995b == aVar.f50995b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f50995b;
        return ((j.c(this.f50994a) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i10 = this.f50994a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = "null";
                    } else {
                        str = "INVALID_PAYLOAD";
                    }
                } else {
                    str = "FATAL_ERROR";
                }
            } else {
                str = "TRANSIENT_ERROR";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return android.support.v4.media.a.q(sb, this.f50995b, "}");
    }
}
