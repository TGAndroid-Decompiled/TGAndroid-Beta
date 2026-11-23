package p5;

import a8.p0;
import p1.g;
public final class a {
    public final int f55510a;
    public final long f55511b;

    public a(int i7, long j3) {
        if (i7 != 0) {
            this.f55510a = i7;
            this.f55511b = j3;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (g.b(this.f55510a, aVar.f55510a) && this.f55511b == aVar.f55511b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f55511b;
        return ((g.c(this.f55510a) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i7 = this.f55510a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
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
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return p0.r(sb2, this.f55511b, "}");
    }
}
