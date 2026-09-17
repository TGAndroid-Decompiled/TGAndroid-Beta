package s4;
public final class z0 {
    public int f45944a;
    public int f45945b;
    public int f45946c;
    public int d;
    public int f45947e;
    public boolean f45948f;
    public boolean f45949g;
    public boolean h;
    public boolean f45950i;
    public boolean f45951j;
    public boolean f45952k;
    public int f45953l;
    public long f45954m;
    public int f45955n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f45949g) {
            return this.f45945b - this.f45946c;
        }
        return this.f45947e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f45944a + ", mData=null, mItemCount=" + this.f45947e + ", mIsMeasuring=" + this.f45950i + ", mPreviousLayoutItemCount=" + this.f45945b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f45946c + ", mStructureChanged=" + this.f45948f + ", mInPreLayout=" + this.f45949g + ", mRunSimpleAnimations=" + this.f45951j + ", mRunPredictiveAnimations=" + this.f45952k + '}';
    }
}
