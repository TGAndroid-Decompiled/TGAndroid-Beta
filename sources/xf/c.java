package xf;
public final class c extends b {
    public float[] f50592l;

    @Override
    public final void e() {
        super.e();
        int size = this.d.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long j11 = ((a) this.d.get(i10)).f50579e;
            if (j11 > j10) {
                j10 = j11;
            }
        }
        this.f50592l = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            long j12 = ((a) this.d.get(i11)).f50579e;
            if (j10 == j12) {
                this.f50592l[i11] = 1.0f;
            } else {
                this.f50592l[i11] = (float) (j10 / j12);
            }
        }
    }
}
