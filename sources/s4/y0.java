package s4;
public final class y0 {
    public int f46077a;
    public int f46078b;
    public int f46079c;
    public int d;
    public int e;
    public boolean f46080f;
    public boolean f46081g;
    public boolean h;
    public boolean f46082i;
    public boolean f46083j;
    public boolean f46084k;
    public int f46085l;
    public long f46086m;
    public int f46087n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46081g) {
            return this.f46078b - this.f46079c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46077a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f46082i + ", mPreviousLayoutItemCount=" + this.f46078b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46079c + ", mStructureChanged=" + this.f46080f + ", mInPreLayout=" + this.f46081g + ", mRunSimpleAnimations=" + this.f46083j + ", mRunPredictiveAnimations=" + this.f46084k + '}';
    }
}
