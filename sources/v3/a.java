package v3;

import a8.p0;
import h2.x;
public final class a extends b {
    public final int f59032a;
    public final long f59033b;
    public final long f59034c;

    public a(long j3, int i7, long j10) {
        this.f59032a = i7;
        switch (i7) {
            case 1:
                this.f59033b = j3;
                this.f59034c = j10;
                return;
            default:
                this.f59033b = j10;
                this.f59034c = j3;
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
        switch (this.f59032a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f59033b);
                sb2.append(", identifier= ");
                return p0.r(sb2, this.f59034c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f59033b);
                sb3.append(", playbackPositionUs= ");
                return p0.r(sb3, this.f59034c, " }");
        }
    }
}
