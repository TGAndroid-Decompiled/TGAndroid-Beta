package u3;

import a1.g;
import g2.y;
public final class a extends b {
    public final int f55474a;
    public final long f55475b;
    public final long f55476c;

    public a(long j10, int i3, long j11) {
        this.f55474a = i3;
        switch (i3) {
            case 1:
                this.f55475b = j10;
                this.f55476c = j11;
                return;
            default:
                this.f55475b = j11;
                this.f55476c = j10;
                return;
        }
    }

    public static long d(long j10, y yVar) {
        long A = yVar.A();
        if ((128 & A) != 0) {
            return 8589934591L & ((((A & 1) << 32) | yVar.C()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override
    public final String toString() {
        switch (this.f55474a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f55475b);
                sb2.append(", identifier= ");
                return g.r(sb2, this.f55476c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f55475b);
                sb3.append(", playbackPositionUs= ");
                return g.r(sb3, this.f55476c, " }");
        }
    }
}
