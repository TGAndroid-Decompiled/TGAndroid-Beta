package s3;

import a1.g;
import e2.v;
public final class a extends b {
    public final int f47592a;
    public final long f47593b;
    public final long f47594c;

    public a(long j3, long j10, int i10) {
        this.f47592a = i10;
        switch (i10) {
            case 1:
                this.f47593b = j3;
                this.f47594c = j10;
                return;
            default:
                this.f47593b = j10;
                this.f47594c = j3;
                return;
        }
    }

    public static long d(long j3, v vVar) {
        long x10 = vVar.x();
        if ((128 & x10) != 0) {
            return 8589934591L & ((((x10 & 1) << 32) | vVar.z()) + j3);
        }
        return -9223372036854775807L;
    }

    @Override
    public final String toString() {
        switch (this.f47592a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f47593b);
                sb2.append(", identifier= ");
                return g.s(sb2, this.f47594c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f47593b);
                sb3.append(", playbackPositionUs= ");
                return g.s(sb3, this.f47594c, " }");
        }
    }
}
