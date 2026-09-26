package s4;
public final class z0 {
    public int f43118a;
    public int f43119b;
    public int f43120c;
    public int d;
    public int e;
    public boolean f43121f;
    public boolean f43122g;
    public boolean h;
    public boolean f43123i;
    public boolean f43124j;
    public boolean f43125k;
    public int f43126l;
    public long f43127m;
    public int f43128n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43122g) {
            return this.f43119b - this.f43120c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43118a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43123i + ", mPreviousLayoutItemCount=" + this.f43119b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43120c + ", mStructureChanged=" + this.f43121f + ", mInPreLayout=" + this.f43122g + ", mRunSimpleAnimations=" + this.f43124j + ", mRunPredictiveAnimations=" + this.f43125k + '}';
    }
}
