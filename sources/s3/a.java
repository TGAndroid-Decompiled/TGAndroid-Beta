package s3;

import a1.g;
import e2.x;
public final class a extends b {
    public final int f47658a;
    public final long f47659b;
    public final long f47660c;

    public a(long j10, long j11, int i10) {
        this.f47658a = i10;
        switch (i10) {
            case 1:
                this.f47659b = j10;
                this.f47660c = j11;
                return;
            default:
                this.f47659b = j11;
                this.f47660c = j10;
                return;
        }
    }

    public static long d(long j10, x xVar) {
        long A = xVar.A();
        if ((128 & A) != 0) {
            return 8589934591L & ((((A & 1) << 32) | xVar.C()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override
    public final String toString() {
        switch (this.f47658a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f47659b);
                sb2.append(", identifier= ");
                return g.r(sb2, this.f47660c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f47659b);
                sb3.append(", playbackPositionUs= ");
                return g.r(sb3, this.f47660c, " }");
        }
    }
}
