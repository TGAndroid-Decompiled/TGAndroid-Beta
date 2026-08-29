package z2;

import a4.w;
import m1.j;
public final class a {
    public final int f50550a;
    public final long f50551b;

    public a(int i10, long j10) {
        if (i10 != 0) {
            this.f50550a = i10;
            this.f50551b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (j.a(this.f50550a, aVar.f50550a) && this.f50551b == aVar.f50551b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f50551b;
        return ((j.b(this.f50550a) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i10 = this.f50550a;
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
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return w.p(sb2, this.f50551b, "}");
    }
}
