package x2;

import a9.p;
import m1.j;

public final class a {

    public final int f49330a;

    public final long f49331b;

    public a(int i10, long j10) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f49330a = i10;
        this.f49331b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f49330a, aVar.f49330a) && this.f49331b == aVar.f49331b;
    }

    public final int hashCode() {
        int iB = (j.b(this.f49330a) ^ 1000003) * 1000003;
        long j10 = this.f49331b;
        return iB ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i10 = this.f49330a;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return p.o(sb2, this.f49331b, "}");
    }
}
