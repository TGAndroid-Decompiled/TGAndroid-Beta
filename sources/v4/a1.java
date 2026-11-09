package v4;
public final class a1 {
    public int f57010a;
    public int f57011b;
    public int f57012c;
    public int d;
    public int f57013e;
    public boolean f57014f;
    public boolean f57015g;
    public boolean h;
    public boolean f57016i;
    public boolean f57017j;
    public boolean f57018k;
    public int f57019l;
    public long f57020m;
    public int f57021n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f57015g) {
            return this.f57011b - this.f57012c;
        }
        return this.f57013e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f57010a + ", mData=null, mItemCount=" + this.f57013e + ", mIsMeasuring=" + this.f57016i + ", mPreviousLayoutItemCount=" + this.f57011b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f57012c + ", mStructureChanged=" + this.f57014f + ", mInPreLayout=" + this.f57015g + ", mRunSimpleAnimations=" + this.f57017j + ", mRunPredictiveAnimations=" + this.f57018k + '}';
    }
}
