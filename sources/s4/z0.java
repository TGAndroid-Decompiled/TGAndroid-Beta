package s4;
public final class z0 {
    public int f46701a;
    public int f46702b;
    public int f46703c;
    public int d;
    public int f46704e;
    public boolean f46705f;
    public boolean f46706g;
    public boolean h;
    public boolean f46707i;
    public boolean f46708j;
    public boolean f46709k;
    public int f46710l;
    public long f46711m;
    public int f46712n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46706g) {
            return this.f46702b - this.f46703c;
        }
        return this.f46704e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46701a + ", mData=null, mItemCount=" + this.f46704e + ", mIsMeasuring=" + this.f46707i + ", mPreviousLayoutItemCount=" + this.f46702b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46703c + ", mStructureChanged=" + this.f46705f + ", mInPreLayout=" + this.f46706g + ", mRunSimpleAnimations=" + this.f46708j + ", mRunPredictiveAnimations=" + this.f46709k + '}';
    }
}
