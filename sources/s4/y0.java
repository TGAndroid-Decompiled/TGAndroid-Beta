package s4;
public final class y0 {
    public int f46068a;
    public int f46069b;
    public int f46070c;
    public int d;
    public int e;
    public boolean f46071f;
    public boolean f46072g;
    public boolean h;
    public boolean f46073i;
    public boolean f46074j;
    public boolean f46075k;
    public int f46076l;
    public long f46077m;
    public int f46078n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46072g) {
            return this.f46069b - this.f46070c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46068a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f46073i + ", mPreviousLayoutItemCount=" + this.f46069b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46070c + ", mStructureChanged=" + this.f46071f + ", mInPreLayout=" + this.f46072g + ", mRunSimpleAnimations=" + this.f46074j + ", mRunPredictiveAnimations=" + this.f46075k + '}';
    }
}
