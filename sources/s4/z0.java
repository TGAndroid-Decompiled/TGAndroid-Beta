package s4;
public final class z0 {
    public int f42829a;
    public int f42830b;
    public int f42831c;
    public int d;
    public int e;
    public boolean f42832f;
    public boolean f42833g;
    public boolean h;
    public boolean f42834i;
    public boolean f42835j;
    public boolean f42836k;
    public int f42837l;
    public long f42838m;
    public int f42839n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f42833g) {
            return this.f42830b - this.f42831c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f42829a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f42834i + ", mPreviousLayoutItemCount=" + this.f42830b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f42831c + ", mStructureChanged=" + this.f42832f + ", mInPreLayout=" + this.f42833g + ", mRunSimpleAnimations=" + this.f42835j + ", mRunPredictiveAnimations=" + this.f42836k + '}';
    }
}
