package rf;
public final class c extends b {
    public float[] f47169l;

    @Override
    public final void e() {
        super.e();
        int size = this.d.size();
        long j10 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            long j11 = ((a) this.d.get(i9)).f47156e;
            if (j11 > j10) {
                j10 = j11;
            }
        }
        this.f47169l = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long j12 = ((a) this.d.get(i10)).f47156e;
            if (j10 == j12) {
                this.f47169l[i10] = 1.0f;
            } else {
                this.f47169l[i10] = (float) (j10 / j12);
            }
        }
    }
}
