package s4;
public final class a1 {
    public int f47606a;
    public int f47607b;
    public int f47608c;
    public int d;
    public int f47609e;
    public boolean f47610f;
    public boolean f47611g;
    public boolean h;
    public boolean f47612i;
    public boolean f47613j;
    public boolean f47614k;
    public int f47615l;
    public long f47616m;
    public int f47617n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47611g) {
            return this.f47607b - this.f47608c;
        }
        return this.f47609e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47606a + ", mData=null, mItemCount=" + this.f47609e + ", mIsMeasuring=" + this.f47612i + ", mPreviousLayoutItemCount=" + this.f47607b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47608c + ", mStructureChanged=" + this.f47610f + ", mInPreLayout=" + this.f47611g + ", mRunSimpleAnimations=" + this.f47613j + ", mRunPredictiveAnimations=" + this.f47614k + '}';
    }
}
