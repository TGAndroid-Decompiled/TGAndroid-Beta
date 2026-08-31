package s4;
public final class j {
    public final long f46982a;
    public final long f46983b;
    public final String f46984c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f46984c = str == null ? "" : str;
        this.f46982a = j10;
        this.f46983b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        long j11;
        long j12;
        String G = h5.a.G(str, this.f46984c);
        if (jVar != null) {
            long j13 = jVar.f46983b;
            if (G.equals(h5.a.G(str, jVar.f46984c))) {
                long j14 = this.f46983b;
                if (j14 != -1) {
                    j10 = j13;
                    long j15 = this.f46982a;
                    jVar2 = null;
                    if (j15 + j14 == jVar.f46982a) {
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
                    long j16 = jVar.f46982a;
                    if (j16 + j10 == this.f46982a) {
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
            if (this.f46982a == jVar.f46982a && this.f46983b == jVar.f46983b && this.f46984c.equals(jVar.f46984c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f46984c.hashCode() + ((((527 + ((int) this.f46982a)) * 31) + ((int) this.f46983b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f46984c);
        sb.append(", start=");
        sb.append(this.f46982a);
        sb.append(", length=");
        return android.support.v4.media.a.q(sb, this.f46983b, ")");
    }
}
