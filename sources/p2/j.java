package p2;

import a8.p0;
public final class j {
    public final long f53015a;
    public final long f53016b;
    public final String f53017c;
    public int d;

    public j(long j3, String str, long j10) {
        this.f53017c = str == null ? "" : str;
        this.f53015a = j3;
        this.f53016b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f10 = h2.e.f(str, this.f53017c);
        if (jVar != null) {
            long j3 = jVar.f53016b;
            if (f10.equals(h2.e.f(str, jVar.f53017c))) {
                long j10 = this.f53016b;
                long j11 = -1;
                if (j10 != -1) {
                    long j12 = this.f53015a;
                    jVar2 = null;
                    if (j12 + j10 == jVar.f53015a) {
                        if (j3 != -1) {
                            j11 = j10 + j3;
                        }
                        return new j(j12, f10, j11);
                    }
                } else {
                    jVar2 = null;
                }
                if (j3 != -1) {
                    long j13 = jVar.f53015a;
                    if (j13 + j3 == this.f53015a) {
                        if (j10 != -1) {
                            j11 = j3 + j10;
                        }
                        return new j(j13, f10, j11);
                    }
                    return jVar2;
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f53015a == jVar.f53015a && this.f53016b == jVar.f53016b && this.f53017c.equals(jVar.f53017c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f53017c.hashCode() + ((((527 + ((int) this.f53015a)) * 31) + ((int) this.f53016b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f53017c);
        sb2.append(", start=");
        sb2.append(this.f53015a);
        sb2.append(", length=");
        return p0.r(sb2, this.f53016b, ")");
    }
}
