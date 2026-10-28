package s4;
public final class b1 {
    public int f47729a;
    public int f47730b;
    public int f47731c;
    public int d;
    public int e;
    public boolean f47732f;
    public boolean f47733g;
    public boolean h;
    public boolean f47734i;
    public boolean f47735j;
    public boolean f47736k;
    public int f47737l;
    public long f47738m;
    public int f47739n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47733g) {
            return this.f47730b - this.f47731c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47729a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f47734i + ", mPreviousLayoutItemCount=" + this.f47730b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47731c + ", mStructureChanged=" + this.f47732f + ", mInPreLayout=" + this.f47733g + ", mRunSimpleAnimations=" + this.f47735j + ", mRunPredictiveAnimations=" + this.f47736k + '}';
    }
}
