package v3;

import a8.p0;
import h2.x;
public final class a extends b {
    public final int f58464a;
    public final long f58465b;
    public final long f58466c;

    public a(long j3, int i7, long j10) {
        this.f58464a = i7;
        switch (i7) {
            case 1:
                this.f58465b = j3;
                this.f58466c = j10;
                return;
            default:
                this.f58465b = j10;
                this.f58466c = j3;
                return;
        }
    }

    public static long d(long j3, x xVar) {
        long A = xVar.A();
        if ((128 & A) != 0) {
            return 8589934591L & ((((A & 1) << 32) | xVar.C()) + j3);
        }
        return -9223372036854775807L;
    }

    @Override
    public final String toString() {
        switch (this.f58464a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f58465b);
                sb2.append(", identifier= ");
                return p0.r(sb2, this.f58466c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f58465b);
                sb3.append(", playbackPositionUs= ");
                return p0.r(sb3, this.f58466c, " }");
        }
    }
}
