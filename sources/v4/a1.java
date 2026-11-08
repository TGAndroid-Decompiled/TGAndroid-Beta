package v4;
public final class a1 {
    public int f56997a;
    public int f56998b;
    public int f56999c;
    public int d;
    public int f57000e;
    public boolean f57001f;
    public boolean f57002g;
    public boolean h;
    public boolean f57003i;
    public boolean f57004j;
    public boolean f57005k;
    public int f57006l;
    public long f57007m;
    public int f57008n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f57002g) {
            return this.f56998b - this.f56999c;
        }
        return this.f57000e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f56997a + ", mData=null, mItemCount=" + this.f57000e + ", mIsMeasuring=" + this.f57003i + ", mPreviousLayoutItemCount=" + this.f56998b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f56999c + ", mStructureChanged=" + this.f57001f + ", mInPreLayout=" + this.f57002g + ", mRunSimpleAnimations=" + this.f57004j + ", mRunPredictiveAnimations=" + this.f57005k + '}';
    }
}
