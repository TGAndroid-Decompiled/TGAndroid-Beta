package s3;

import a1.g;
import e2.x;
public final class a extends b {
    public final int f45872a;
    public final long f45873b;
    public final long f45874c;

    public a(long j10, long j11, int i10) {
        this.f45872a = i10;
        switch (i10) {
            case 1:
                this.f45873b = j10;
                this.f45874c = j11;
                return;
            default:
                this.f45873b = j11;
                this.f45874c = j10;
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
        switch (this.f45872a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f45873b);
                sb2.append(", identifier= ");
                return g.r(sb2, this.f45874c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f45873b);
                sb3.append(", playbackPositionUs= ");
                return g.r(sb3, this.f45874c, " }");
        }
    }
}
