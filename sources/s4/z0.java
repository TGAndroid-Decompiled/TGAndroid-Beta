package s4;
public final class z0 {
    public int f46700a;
    public int f46701b;
    public int f46702c;
    public int d;
    public int f46703e;
    public boolean f46704f;
    public boolean f46705g;
    public boolean h;
    public boolean f46706i;
    public boolean f46707j;
    public boolean f46708k;
    public int f46709l;
    public long f46710m;
    public int f46711n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46705g) {
            return this.f46701b - this.f46702c;
        }
        return this.f46703e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46700a + ", mData=null, mItemCount=" + this.f46703e + ", mIsMeasuring=" + this.f46706i + ", mPreviousLayoutItemCount=" + this.f46701b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46702c + ", mStructureChanged=" + this.f46704f + ", mInPreLayout=" + this.f46705g + ", mRunSimpleAnimations=" + this.f46707j + ", mRunPredictiveAnimations=" + this.f46708k + '}';
    }
}
