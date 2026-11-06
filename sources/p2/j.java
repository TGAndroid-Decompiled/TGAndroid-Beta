package p2;

import a8.p0;
public final class j {
    public final long f53039a;
    public final long f53040b;
    public final String f53041c;
    public int d;

    public j(long j3, String str, long j10) {
        this.f53041c = str == null ? "" : str;
        this.f53039a = j3;
        this.f53040b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f10 = h2.e.f(str, this.f53041c);
        if (jVar != null) {
            long j3 = jVar.f53040b;
            if (f10.equals(h2.e.f(str, jVar.f53041c))) {
                long j10 = this.f53040b;
                long j11 = -1;
                if (j10 != -1) {
                    long j12 = this.f53039a;
                    jVar2 = null;
                    if (j12 + j10 == jVar.f53039a) {
                        if (j3 != -1) {
                            j11 = j10 + j3;
                        }
                        return new j(j12, f10, j11);
                    }
                } else {
                    jVar2 = null;
                }
                if (j3 != -1) {
                    long j13 = jVar.f53039a;
                    if (j13 + j3 == this.f53039a) {
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
            if (this.f53039a == jVar.f53039a && this.f53040b == jVar.f53040b && this.f53041c.equals(jVar.f53041c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f53041c.hashCode() + ((((527 + ((int) this.f53039a)) * 31) + ((int) this.f53040b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f53041c);
        sb2.append(", start=");
        sb2.append(this.f53039a);
        sb2.append(", length=");
        return p0.r(sb2, this.f53040b, ")");
    }
}
