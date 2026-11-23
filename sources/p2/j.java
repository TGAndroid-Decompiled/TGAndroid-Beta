package p2;

import a8.p0;
public final class j {
    public final long f55245a;
    public final long f55246b;
    public final String f55247c;
    public int d;

    public j(long j3, String str, long j10) {
        this.f55247c = str == null ? "" : str;
        this.f55245a = j3;
        this.f55246b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f10 = h2.e.f(str, this.f55247c);
        if (jVar != null) {
            long j3 = jVar.f55246b;
            if (f10.equals(h2.e.f(str, jVar.f55247c))) {
                long j10 = this.f55246b;
                long j11 = -1;
                if (j10 != -1) {
                    long j12 = this.f55245a;
                    jVar2 = null;
                    if (j12 + j10 == jVar.f55245a) {
                        if (j3 != -1) {
                            j11 = j10 + j3;
                        }
                        return new j(j12, f10, j11);
                    }
                } else {
                    jVar2 = null;
                }
                if (j3 != -1) {
                    long j13 = jVar.f55245a;
                    if (j13 + j3 == this.f55245a) {
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
            if (this.f55245a == jVar.f55245a && this.f55246b == jVar.f55246b && this.f55247c.equals(jVar.f55247c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f55247c.hashCode() + ((((527 + ((int) this.f55245a)) * 31) + ((int) this.f55246b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f55247c);
        sb2.append(", start=");
        sb2.append(this.f55245a);
        sb2.append(", length=");
        return p0.r(sb2, this.f55246b, ")");
    }
}
