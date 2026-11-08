package v4;
public final class a1 {
    public int f56998a;
    public int f56999b;
    public int f57000c;
    public int d;
    public int f57001e;
    public boolean f57002f;
    public boolean f57003g;
    public boolean h;
    public boolean f57004i;
    public boolean f57005j;
    public boolean f57006k;
    public int f57007l;
    public long f57008m;
    public int f57009n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f57003g) {
            return this.f56999b - this.f57000c;
        }
        return this.f57001e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f56998a + ", mData=null, mItemCount=" + this.f57001e + ", mIsMeasuring=" + this.f57004i + ", mPreviousLayoutItemCount=" + this.f56999b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f57000c + ", mStructureChanged=" + this.f57002f + ", mInPreLayout=" + this.f57003g + ", mRunSimpleAnimations=" + this.f57005j + ", mRunPredictiveAnimations=" + this.f57006k + '}';
    }
}
