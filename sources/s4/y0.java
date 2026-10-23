package s4;
public final class y0 {
    public int f46499a;
    public int f46500b;
    public int f46501c;
    public int d;
    public int e;
    public boolean f46502f;
    public boolean f46503g;
    public boolean h;
    public boolean f46504i;
    public boolean f46505j;
    public boolean f46506k;
    public int f46507l;
    public long f46508m;
    public int f46509n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46503g) {
            return this.f46500b - this.f46501c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46499a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f46504i + ", mPreviousLayoutItemCount=" + this.f46500b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46501c + ", mStructureChanged=" + this.f46502f + ", mInPreLayout=" + this.f46503g + ", mRunSimpleAnimations=" + this.f46505j + ", mRunPredictiveAnimations=" + this.f46506k + '}';
    }
}
