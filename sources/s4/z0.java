package s4;
public final class z0 {
    public int f42785a;
    public int f42786b;
    public int f42787c;
    public int d;
    public int e;
    public boolean f42788f;
    public boolean f42789g;
    public boolean h;
    public boolean f42790i;
    public boolean f42791j;
    public boolean f42792k;
    public int f42793l;
    public long f42794m;
    public int f42795n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f42789g) {
            return this.f42786b - this.f42787c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f42785a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f42790i + ", mPreviousLayoutItemCount=" + this.f42786b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f42787c + ", mStructureChanged=" + this.f42788f + ", mInPreLayout=" + this.f42789g + ", mRunSimpleAnimations=" + this.f42791j + ", mRunPredictiveAnimations=" + this.f42792k + '}';
    }
}
