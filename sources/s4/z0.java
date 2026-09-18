package s4;
public final class z0 {
    public int f43087a;
    public int f43088b;
    public int f43089c;
    public int d;
    public int e;
    public boolean f43090f;
    public boolean f43091g;
    public boolean h;
    public boolean f43092i;
    public boolean f43093j;
    public boolean f43094k;
    public int f43095l;
    public long f43096m;
    public int f43097n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43091g) {
            return this.f43088b - this.f43089c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43087a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43092i + ", mPreviousLayoutItemCount=" + this.f43088b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43089c + ", mStructureChanged=" + this.f43090f + ", mInPreLayout=" + this.f43091g + ", mRunSimpleAnimations=" + this.f43093j + ", mRunPredictiveAnimations=" + this.f43094k + '}';
    }
}
