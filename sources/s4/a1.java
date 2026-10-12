package s4;
public final class a1 {
    public int f47839a;
    public int f47840b;
    public int f47841c;
    public int d;
    public int f47842e;
    public boolean f47843f;
    public boolean f47844g;
    public boolean h;
    public boolean f47845i;
    public boolean f47846j;
    public boolean f47847k;
    public int f47848l;
    public long f47849m;
    public int f47850n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47844g) {
            return this.f47840b - this.f47841c;
        }
        return this.f47842e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47839a + ", mData=null, mItemCount=" + this.f47842e + ", mIsMeasuring=" + this.f47845i + ", mPreviousLayoutItemCount=" + this.f47840b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47841c + ", mStructureChanged=" + this.f47843f + ", mInPreLayout=" + this.f47844g + ", mRunSimpleAnimations=" + this.f47846j + ", mRunPredictiveAnimations=" + this.f47847k + '}';
    }
}
