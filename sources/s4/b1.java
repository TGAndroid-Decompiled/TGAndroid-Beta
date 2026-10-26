package s4;
public final class b1 {
    public int f47694a;
    public int f47695b;
    public int f47696c;
    public int d;
    public int e;
    public boolean f47697f;
    public boolean f47698g;
    public boolean h;
    public boolean f47699i;
    public boolean f47700j;
    public boolean f47701k;
    public int f47702l;
    public long f47703m;
    public int f47704n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47698g) {
            return this.f47695b - this.f47696c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47694a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f47699i + ", mPreviousLayoutItemCount=" + this.f47695b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47696c + ", mStructureChanged=" + this.f47697f + ", mInPreLayout=" + this.f47698g + ", mRunSimpleAnimations=" + this.f47700j + ", mRunPredictiveAnimations=" + this.f47701k + '}';
    }
}
