package s4;
public final class z0 {
    public int f43153a;
    public int f43154b;
    public int f43155c;
    public int d;
    public int e;
    public boolean f43156f;
    public boolean f43157g;
    public boolean h;
    public boolean f43158i;
    public boolean f43159j;
    public boolean f43160k;
    public int f43161l;
    public long f43162m;
    public int f43163n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43157g) {
            return this.f43154b - this.f43155c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43153a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43158i + ", mPreviousLayoutItemCount=" + this.f43154b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43155c + ", mStructureChanged=" + this.f43156f + ", mInPreLayout=" + this.f43157g + ", mRunSimpleAnimations=" + this.f43159j + ", mRunPredictiveAnimations=" + this.f43160k + '}';
    }
}
