package s4;
public final class y0 {
    public int f46073a;
    public int f46074b;
    public int f46075c;
    public int d;
    public int e;
    public boolean f46076f;
    public boolean f46077g;
    public boolean h;
    public boolean f46078i;
    public boolean f46079j;
    public boolean f46080k;
    public int f46081l;
    public long f46082m;
    public int f46083n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46077g) {
            return this.f46074b - this.f46075c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46073a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f46078i + ", mPreviousLayoutItemCount=" + this.f46074b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46075c + ", mStructureChanged=" + this.f46076f + ", mInPreLayout=" + this.f46077g + ", mRunSimpleAnimations=" + this.f46079j + ", mRunPredictiveAnimations=" + this.f46080k + '}';
    }
}
