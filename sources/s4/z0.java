package s4;
public final class z0 {
    public int f43163a;
    public int f43164b;
    public int f43165c;
    public int d;
    public int e;
    public boolean f43166f;
    public boolean f43167g;
    public boolean h;
    public boolean f43168i;
    public boolean f43169j;
    public boolean f43170k;
    public int f43171l;
    public long f43172m;
    public int f43173n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43167g) {
            return this.f43164b - this.f43165c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43163a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43168i + ", mPreviousLayoutItemCount=" + this.f43164b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43165c + ", mStructureChanged=" + this.f43166f + ", mInPreLayout=" + this.f43167g + ", mRunSimpleAnimations=" + this.f43169j + ", mRunPredictiveAnimations=" + this.f43170k + '}';
    }
}
