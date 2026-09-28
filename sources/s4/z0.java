package s4;
public final class z0 {
    public int f43119a;
    public int f43120b;
    public int f43121c;
    public int d;
    public int e;
    public boolean f43122f;
    public boolean f43123g;
    public boolean h;
    public boolean f43124i;
    public boolean f43125j;
    public boolean f43126k;
    public int f43127l;
    public long f43128m;
    public int f43129n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43123g) {
            return this.f43120b - this.f43121c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43119a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43124i + ", mPreviousLayoutItemCount=" + this.f43120b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43121c + ", mStructureChanged=" + this.f43122f + ", mInPreLayout=" + this.f43123g + ", mRunSimpleAnimations=" + this.f43125j + ", mRunPredictiveAnimations=" + this.f43126k + '}';
    }
}
