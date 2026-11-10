package p5;

import a8.p0;
import p1.g;
public final class a {
    public final int f53483a;
    public final long f53484b;

    public a(int i7, long j3) {
        if (i7 != 0) {
            this.f53483a = i7;
            this.f53484b = j3;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (g.b(this.f53483a, aVar.f53483a) && this.f53484b == aVar.f53484b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f53484b;
        return ((g.c(this.f53483a) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i7 = this.f53483a;
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
        return p0.r(sb2, this.f53484b, "}");
    }
}
