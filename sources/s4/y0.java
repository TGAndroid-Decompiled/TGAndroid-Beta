package s4;
public final class y0 {
    public int f44994a;
    public int f44995b;
    public int f44996c;
    public int d;
    public int e;
    public boolean f44997f;
    public boolean f44998g;
    public boolean h;
    public boolean f44999i;
    public boolean f45000j;
    public boolean f45001k;
    public int f45002l;
    public long f45003m;
    public int f45004n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f44998g) {
            return this.f44995b - this.f44996c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f44994a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f44999i + ", mPreviousLayoutItemCount=" + this.f44995b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f44996c + ", mStructureChanged=" + this.f44997f + ", mInPreLayout=" + this.f44998g + ", mRunSimpleAnimations=" + this.f45000j + ", mRunPredictiveAnimations=" + this.f45001k + '}';
    }
}
