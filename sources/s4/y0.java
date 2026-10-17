package s4;
public final class y0 {
    public int f46094a;
    public int f46095b;
    public int f46096c;
    public int d;
    public int e;
    public boolean f46097f;
    public boolean f46098g;
    public boolean h;
    public boolean f46099i;
    public boolean f46100j;
    public boolean f46101k;
    public int f46102l;
    public long f46103m;
    public int f46104n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46098g) {
            return this.f46095b - this.f46096c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46094a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f46099i + ", mPreviousLayoutItemCount=" + this.f46095b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46096c + ", mStructureChanged=" + this.f46097f + ", mInPreLayout=" + this.f46098g + ", mRunSimpleAnimations=" + this.f46100j + ", mRunPredictiveAnimations=" + this.f46101k + '}';
    }
}
