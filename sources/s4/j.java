package s4;
public final class j {
    public final long f44081a;
    public final long f44082b;
    public final String f44083c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f44083c = str == null ? "" : str;
        this.f44081a = j10;
        this.f44082b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        long j11;
        long j12;
        String G = h5.a.G(str, this.f44083c);
        if (jVar != null) {
            long j13 = jVar.f44082b;
            if (G.equals(h5.a.G(str, jVar.f44083c))) {
                long j14 = this.f44082b;
                if (j14 != -1) {
                    j10 = j13;
                    long j15 = this.f44081a;
                    jVar2 = null;
                    if (j15 + j14 == jVar.f44081a) {
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
                    long j16 = jVar.f44081a;
                    if (j16 + j10 == this.f44081a) {
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
            if (this.f44081a == jVar.f44081a && this.f44082b == jVar.f44082b && this.f44083c.equals(jVar.f44083c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f44083c.hashCode() + ((((527 + ((int) this.f44081a)) * 31) + ((int) this.f44082b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f44083c);
        sb.append(", start=");
        sb.append(this.f44081a);
        sb.append(", length=");
        return android.support.v4.media.a.q(sb, this.f44082b, ")");
    }
}
