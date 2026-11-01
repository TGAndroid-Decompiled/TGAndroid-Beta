package s4;
public final class z0 {
    public int f48064a;
    public int f48065b;
    public int f48066c;
    public int d;
    public int e;
    public boolean f48067f;
    public boolean f48068g;
    public boolean h;
    public boolean f48069i;
    public boolean f48070j;
    public boolean f48071k;
    public int f48072l;
    public long f48073m;
    public int f48074n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f48068g) {
            return this.f48065b - this.f48066c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f48064a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f48069i + ", mPreviousLayoutItemCount=" + this.f48065b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f48066c + ", mStructureChanged=" + this.f48067f + ", mInPreLayout=" + this.f48068g + ", mRunSimpleAnimations=" + this.f48070j + ", mRunPredictiveAnimations=" + this.f48071k + '}';
    }
}
