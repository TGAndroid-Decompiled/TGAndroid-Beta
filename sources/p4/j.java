package p4;

import a4.w;
public final class j {
    public final long f45573a;
    public final long f45574b;
    public final String f45575c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f45575c = str == null ? "" : str;
        this.f45573a = j10;
        this.f45574b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        long j11;
        long j12;
        String G = f5.a.G(str, this.f45575c);
        if (jVar != null) {
            long j13 = jVar.f45574b;
            if (G.equals(f5.a.G(str, jVar.f45575c))) {
                long j14 = this.f45574b;
                if (j14 != -1) {
                    j10 = j13;
                    long j15 = this.f45573a;
                    jVar2 = null;
                    if (j15 + j14 == jVar.f45573a) {
                        if (j10 == -1) {
                            j12 = -1;
                        } else {
                            j12 = j14 + j10;
                        }
                        return new j(j15, j12, G);
                    }
                } else {
                    jVar2 = null;
                    j10 = j13;
                }
                if (j10 != -1) {
                    long j16 = jVar.f45573a;
                    if (j16 + j10 == this.f45573a) {
                        if (j14 == -1) {
                            j11 = -1;
                        } else {
                            j11 = j10 + j14;
                        }
                        return new j(j16, j11, G);
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
            if (this.f45573a == jVar.f45573a && this.f45574b == jVar.f45574b && this.f45575c.equals(jVar.f45575c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f45575c.hashCode() + ((((527 + ((int) this.f45573a)) * 31) + ((int) this.f45574b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f45575c);
        sb2.append(", start=");
        sb2.append(this.f45573a);
        sb2.append(", length=");
        return w.p(sb2, this.f45574b, ")");
    }
}
