package s4;
public final class y0 {
    public int f46114a;
    public int f46115b;
    public int f46116c;
    public int d;
    public int e;
    public boolean f46117f;
    public boolean f46118g;
    public boolean h;
    public boolean f46119i;
    public boolean f46120j;
    public boolean f46121k;
    public int f46122l;
    public long f46123m;
    public int f46124n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46118g) {
            return this.f46115b - this.f46116c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46114a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f46119i + ", mPreviousLayoutItemCount=" + this.f46115b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46116c + ", mStructureChanged=" + this.f46117f + ", mInPreLayout=" + this.f46118g + ", mRunSimpleAnimations=" + this.f46120j + ", mRunPredictiveAnimations=" + this.f46121k + '}';
    }
}
