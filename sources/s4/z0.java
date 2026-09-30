package s4;
public final class z0 {
    public int f43226a;
    public int f43227b;
    public int f43228c;
    public int d;
    public int e;
    public boolean f43229f;
    public boolean f43230g;
    public boolean h;
    public boolean f43231i;
    public boolean f43232j;
    public boolean f43233k;
    public int f43234l;
    public long f43235m;
    public int f43236n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43230g) {
            return this.f43227b - this.f43228c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43226a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43231i + ", mPreviousLayoutItemCount=" + this.f43227b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43228c + ", mStructureChanged=" + this.f43229f + ", mInPreLayout=" + this.f43230g + ", mRunSimpleAnimations=" + this.f43232j + ", mRunPredictiveAnimations=" + this.f43233k + '}';
    }
}
