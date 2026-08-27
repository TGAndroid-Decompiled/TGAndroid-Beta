package sf;

public final class c extends b {

    public float[] f47890l;

    @Override
    public final void e() {
        super.e();
        int size = this.d.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long j11 = ((a) this.d.get(i10)).f47877e;
            if (j11 > j10) {
                j10 = j11;
            }
        }
        this.f47890l = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            long j12 = ((a) this.d.get(i11)).f47877e;
            if (j10 == j12) {
                this.f47890l[i11] = 1.0f;
            } else {
                this.f47890l[i11] = j10 / j12;
            }
        }
    }
}
