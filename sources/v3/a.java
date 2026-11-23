package v3;

import a8.p0;
import h2.x;
public final class a extends b {
    public final int f59074a;
    public final long f59075b;
    public final long f59076c;

    public a(long j3, int i7, long j10) {
        this.f59074a = i7;
        switch (i7) {
            case 1:
                this.f59075b = j3;
                this.f59076c = j10;
                return;
            default:
                this.f59075b = j10;
                this.f59076c = j3;
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
        switch (this.f59074a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f59075b);
                sb2.append(", identifier= ");
                return p0.r(sb2, this.f59076c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f59075b);
                sb3.append(", playbackPositionUs= ");
                return p0.r(sb3, this.f59076c, " }");
        }
    }
}
