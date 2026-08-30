package s4;
public final class j {
    public final long f44016a;
    public final long f44017b;
    public final String f44018c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f44018c = str == null ? "" : str;
        this.f44016a = j10;
        this.f44017b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        long j11;
        long j12;
        String G = h5.a.G(str, this.f44018c);
        if (jVar != null) {
            long j13 = jVar.f44017b;
            if (G.equals(h5.a.G(str, jVar.f44018c))) {
                long j14 = this.f44017b;
                if (j14 != -1) {
                    j10 = j13;
                    long j15 = this.f44016a;
                    jVar2 = null;
                    if (j15 + j14 == jVar.f44016a) {
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
                    long j16 = jVar.f44016a;
                    if (j16 + j10 == this.f44016a) {
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
            if (this.f44016a == jVar.f44016a && this.f44017b == jVar.f44017b && this.f44018c.equals(jVar.f44018c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f44018c.hashCode() + ((((527 + ((int) this.f44016a)) * 31) + ((int) this.f44017b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f44018c);
        sb.append(", start=");
        sb.append(this.f44016a);
        sb.append(", length=");
        return android.support.v4.media.a.q(sb, this.f44017b, ")");
    }
}
