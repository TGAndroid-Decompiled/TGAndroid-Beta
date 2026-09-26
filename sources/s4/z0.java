package s4;
public final class z0 {
    public int f43117a;
    public int f43118b;
    public int f43119c;
    public int d;
    public int e;
    public boolean f43120f;
    public boolean f43121g;
    public boolean h;
    public boolean f43122i;
    public boolean f43123j;
    public boolean f43124k;
    public int f43125l;
    public long f43126m;
    public int f43127n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43121g) {
            return this.f43118b - this.f43119c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43117a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43122i + ", mPreviousLayoutItemCount=" + this.f43118b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43119c + ", mStructureChanged=" + this.f43120f + ", mInPreLayout=" + this.f43121g + ", mRunSimpleAnimations=" + this.f43123j + ", mRunPredictiveAnimations=" + this.f43124k + '}';
    }
}
