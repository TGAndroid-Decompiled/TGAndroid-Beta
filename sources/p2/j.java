package p2;

import a8.p0;
public final class j {
    public final long f55164a;
    public final long f55165b;
    public final String f55166c;
    public int d;

    public j(long j3, String str, long j10) {
        this.f55166c = str == null ? "" : str;
        this.f55164a = j3;
        this.f55165b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f10 = h2.e.f(str, this.f55166c);
        if (jVar != null) {
            long j3 = jVar.f55165b;
            if (f10.equals(h2.e.f(str, jVar.f55166c))) {
                long j10 = this.f55165b;
                long j11 = -1;
                if (j10 != -1) {
                    long j12 = this.f55164a;
                    jVar2 = null;
                    if (j12 + j10 == jVar.f55164a) {
                        if (j3 != -1) {
                            j11 = j10 + j3;
                        }
                        return new j(j12, f10, j11);
                    }
                } else {
                    jVar2 = null;
                }
                if (j3 != -1) {
                    long j13 = jVar.f55164a;
                    if (j13 + j3 == this.f55164a) {
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
            if (this.f55164a == jVar.f55164a && this.f55165b == jVar.f55165b && this.f55166c.equals(jVar.f55166c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f55166c.hashCode() + ((((527 + ((int) this.f55164a)) * 31) + ((int) this.f55165b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f55166c);
        sb2.append(", start=");
        sb2.append(this.f55164a);
        sb2.append(", length=");
        return p0.r(sb2, this.f55165b, ")");
    }
}
