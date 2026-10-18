package s4;
public final class y0 {
    public int f46066a;
    public int f46067b;
    public int f46068c;
    public int d;
    public int e;
    public boolean f46069f;
    public boolean f46070g;
    public boolean h;
    public boolean f46071i;
    public boolean f46072j;
    public boolean f46073k;
    public int f46074l;
    public long f46075m;
    public int f46076n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46070g) {
            return this.f46067b - this.f46068c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46066a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f46071i + ", mPreviousLayoutItemCount=" + this.f46067b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46068c + ", mStructureChanged=" + this.f46069f + ", mInPreLayout=" + this.f46070g + ", mRunSimpleAnimations=" + this.f46072j + ", mRunPredictiveAnimations=" + this.f46073k + '}';
    }
}
