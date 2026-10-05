package s3;

import e2.v;
public final class a extends b {
    public final int f46490a;
    public final long f46491b;
    public final long f46492c;

    public a(long j3, long j10, int i10) {
        this.f46490a = i10;
        switch (i10) {
            case 1:
                this.f46491b = j3;
                this.f46492c = j10;
                return;
            default:
                this.f46491b = j10;
                this.f46492c = j3;
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
        switch (this.f46490a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f46491b);
                sb2.append(", identifier= ");
                return a4.a.s(sb2, this.f46492c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f46491b);
                sb3.append(", playbackPositionUs= ");
                return a4.a.s(sb3, this.f46492c, " }");
        }
    }
}
