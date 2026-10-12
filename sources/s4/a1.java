package s4;
public final class a1 {
    public int f47847a;
    public int f47848b;
    public int f47849c;
    public int d;
    public int f47850e;
    public boolean f47851f;
    public boolean f47852g;
    public boolean h;
    public boolean f47853i;
    public boolean f47854j;
    public boolean f47855k;
    public int f47856l;
    public long f47857m;
    public int f47858n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47852g) {
            return this.f47848b - this.f47849c;
        }
        return this.f47850e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47847a + ", mData=null, mItemCount=" + this.f47850e + ", mIsMeasuring=" + this.f47853i + ", mPreviousLayoutItemCount=" + this.f47848b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47849c + ", mStructureChanged=" + this.f47851f + ", mInPreLayout=" + this.f47852g + ", mRunSimpleAnimations=" + this.f47854j + ", mRunPredictiveAnimations=" + this.f47855k + '}';
    }
}
