package p2;

import a8.p0;
public final class j {
    public final long f53144a;
    public final long f53145b;
    public final String f53146c;
    public int d;

    public j(long j3, String str, long j10) {
        this.f53146c = str == null ? "" : str;
        this.f53144a = j3;
        this.f53145b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f10 = h2.e.f(str, this.f53146c);
        if (jVar != null) {
            long j3 = jVar.f53145b;
            if (f10.equals(h2.e.f(str, jVar.f53146c))) {
                long j10 = this.f53145b;
                long j11 = -1;
                if (j10 != -1) {
                    long j12 = this.f53144a;
                    jVar2 = null;
                    if (j12 + j10 == jVar.f53144a) {
                        if (j3 != -1) {
                            j11 = j10 + j3;
                        }
                        return new j(j12, f10, j11);
                    }
                } else {
                    jVar2 = null;
                }
                if (j3 != -1) {
                    long j13 = jVar.f53144a;
                    if (j13 + j3 == this.f53144a) {
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
            if (this.f53144a == jVar.f53144a && this.f53145b == jVar.f53145b && this.f53146c.equals(jVar.f53146c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f53146c.hashCode() + ((((527 + ((int) this.f53144a)) * 31) + ((int) this.f53145b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f53146c);
        sb2.append(", start=");
        sb2.append(this.f53144a);
        sb2.append(", length=");
        return p0.r(sb2, this.f53145b, ")");
    }
}
