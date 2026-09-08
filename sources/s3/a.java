package s3;

import e2.v;
public final class a extends b {
    public final int f45718a;
    public final long f45719b;
    public final long f45720c;

    public a(long j3, long j10, int i10) {
        this.f45718a = i10;
        switch (i10) {
            case 1:
                this.f45719b = j3;
                this.f45720c = j10;
                return;
            default:
                this.f45719b = j10;
                this.f45720c = j3;
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
        switch (this.f45718a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f45719b);
                sb2.append(", identifier= ");
                return a4.a.r(sb2, this.f45720c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f45719b);
                sb3.append(", playbackPositionUs= ");
                return a4.a.r(sb3, this.f45720c, " }");
        }
    }
}
