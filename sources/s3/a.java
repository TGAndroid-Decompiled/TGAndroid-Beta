package s3;

import a1.g;
import e2.x;
public final class a extends b {
    public final int f47866a;
    public final long f47867b;
    public final long f47868c;

    public a(long j10, int i10, long j11) {
        this.f47866a = i10;
        switch (i10) {
            case 1:
                this.f47867b = j10;
                this.f47868c = j11;
                return;
            default:
                this.f47867b = j11;
                this.f47868c = j10;
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
        switch (this.f47866a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f47867b);
                sb2.append(", identifier= ");
                return g.q(sb2, this.f47868c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f47867b);
                sb3.append(", playbackPositionUs= ");
                return g.q(sb3, this.f47868c, " }");
        }
    }
}
