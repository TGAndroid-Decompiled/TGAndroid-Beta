package s4;
public final class z0 {
    public int f43120a;
    public int f43121b;
    public int f43122c;
    public int d;
    public int e;
    public boolean f43123f;
    public boolean f43124g;
    public boolean h;
    public boolean f43125i;
    public boolean f43126j;
    public boolean f43127k;
    public int f43128l;
    public long f43129m;
    public int f43130n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43124g) {
            return this.f43121b - this.f43122c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43120a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43125i + ", mPreviousLayoutItemCount=" + this.f43121b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43122c + ", mStructureChanged=" + this.f43123f + ", mInPreLayout=" + this.f43124g + ", mRunSimpleAnimations=" + this.f43126j + ", mRunPredictiveAnimations=" + this.f43127k + '}';
    }
}
