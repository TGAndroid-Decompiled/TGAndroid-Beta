package v4;
public final class a1 {
    public int f56905a;
    public int f56906b;
    public int f56907c;
    public int d;
    public int f56908e;
    public boolean f56909f;
    public boolean f56910g;
    public boolean h;
    public boolean f56911i;
    public boolean f56912j;
    public boolean f56913k;
    public int f56914l;
    public long f56915m;
    public int f56916n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f56910g) {
            return this.f56906b - this.f56907c;
        }
        return this.f56908e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f56905a + ", mData=null, mItemCount=" + this.f56908e + ", mIsMeasuring=" + this.f56911i + ", mPreviousLayoutItemCount=" + this.f56906b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f56907c + ", mStructureChanged=" + this.f56909f + ", mInPreLayout=" + this.f56910g + ", mRunSimpleAnimations=" + this.f56912j + ", mRunPredictiveAnimations=" + this.f56913k + '}';
    }
}
