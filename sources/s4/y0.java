package s4;
public final class y0 {
    public int f46498a;
    public int f46499b;
    public int f46500c;
    public int d;
    public int e;
    public boolean f46501f;
    public boolean f46502g;
    public boolean h;
    public boolean f46503i;
    public boolean f46504j;
    public boolean f46505k;
    public int f46506l;
    public long f46507m;
    public int f46508n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46502g) {
            return this.f46499b - this.f46500c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46498a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f46503i + ", mPreviousLayoutItemCount=" + this.f46499b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46500c + ", mStructureChanged=" + this.f46501f + ", mInPreLayout=" + this.f46502g + ", mRunSimpleAnimations=" + this.f46504j + ", mRunPredictiveAnimations=" + this.f46505k + '}';
    }
}
