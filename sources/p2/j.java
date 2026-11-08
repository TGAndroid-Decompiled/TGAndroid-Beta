package p2;

import a8.p0;
public final class j {
    public final long f53133a;
    public final long f53134b;
    public final String f53135c;
    public int d;

    public j(long j3, String str, long j10) {
        this.f53135c = str == null ? "" : str;
        this.f53133a = j3;
        this.f53134b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f10 = h2.e.f(str, this.f53135c);
        if (jVar != null) {
            long j3 = jVar.f53134b;
            if (f10.equals(h2.e.f(str, jVar.f53135c))) {
                long j10 = this.f53134b;
                long j11 = -1;
                if (j10 != -1) {
                    long j12 = this.f53133a;
                    jVar2 = null;
                    if (j12 + j10 == jVar.f53133a) {
                        if (j3 != -1) {
                            j11 = j10 + j3;
                        }
                        return new j(j12, f10, j11);
                    }
                } else {
                    jVar2 = null;
                }
                if (j3 != -1) {
                    long j13 = jVar.f53133a;
                    if (j13 + j3 == this.f53133a) {
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
            if (this.f53133a == jVar.f53133a && this.f53134b == jVar.f53134b && this.f53135c.equals(jVar.f53135c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f53135c.hashCode() + ((((527 + ((int) this.f53133a)) * 31) + ((int) this.f53134b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f53135c);
        sb2.append(", start=");
        sb2.append(this.f53133a);
        sb2.append(", length=");
        return p0.r(sb2, this.f53134b, ")");
    }
}
