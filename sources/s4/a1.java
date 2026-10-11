package s4;
public final class a1 {
    public int f47698a;
    public int f47699b;
    public int f47700c;
    public int d;
    public int f47701e;
    public boolean f47702f;
    public boolean f47703g;
    public boolean h;
    public boolean f47704i;
    public boolean f47705j;
    public boolean f47706k;
    public int f47707l;
    public long f47708m;
    public int f47709n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47703g) {
            return this.f47699b - this.f47700c;
        }
        return this.f47701e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47698a + ", mData=null, mItemCount=" + this.f47701e + ", mIsMeasuring=" + this.f47704i + ", mPreviousLayoutItemCount=" + this.f47699b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47700c + ", mStructureChanged=" + this.f47702f + ", mInPreLayout=" + this.f47703g + ", mRunSimpleAnimations=" + this.f47705j + ", mRunPredictiveAnimations=" + this.f47706k + '}';
    }
}
