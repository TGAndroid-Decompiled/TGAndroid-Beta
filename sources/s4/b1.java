package s4;
public final class b1 {
    public int f47691a;
    public int f47692b;
    public int f47693c;
    public int d;
    public int e;
    public boolean f47694f;
    public boolean f47695g;
    public boolean h;
    public boolean f47696i;
    public boolean f47697j;
    public boolean f47698k;
    public int f47699l;
    public long f47700m;
    public int f47701n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47695g) {
            return this.f47692b - this.f47693c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47691a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f47696i + ", mPreviousLayoutItemCount=" + this.f47692b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47693c + ", mStructureChanged=" + this.f47694f + ", mInPreLayout=" + this.f47695g + ", mRunSimpleAnimations=" + this.f47697j + ", mRunPredictiveAnimations=" + this.f47698k + '}';
    }
}
