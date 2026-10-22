package s4;
public final class y0 {
    public int f46076a;
    public int f46077b;
    public int f46078c;
    public int d;
    public int e;
    public boolean f46079f;
    public boolean f46080g;
    public boolean h;
    public boolean f46081i;
    public boolean f46082j;
    public boolean f46083k;
    public int f46084l;
    public long f46085m;
    public int f46086n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46080g) {
            return this.f46077b - this.f46078c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46076a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f46081i + ", mPreviousLayoutItemCount=" + this.f46077b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46078c + ", mStructureChanged=" + this.f46079f + ", mInPreLayout=" + this.f46080g + ", mRunSimpleAnimations=" + this.f46082j + ", mRunPredictiveAnimations=" + this.f46083k + '}';
    }
}
