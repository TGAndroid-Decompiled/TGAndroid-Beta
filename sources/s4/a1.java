package s4;
public final class a1 {
    public int f47732a;
    public int f47733b;
    public int f47734c;
    public int d;
    public int f47735e;
    public boolean f47736f;
    public boolean f47737g;
    public boolean h;
    public boolean f47738i;
    public boolean f47739j;
    public boolean f47740k;
    public int f47741l;
    public long f47742m;
    public int f47743n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47737g) {
            return this.f47733b - this.f47734c;
        }
        return this.f47735e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47732a + ", mData=null, mItemCount=" + this.f47735e + ", mIsMeasuring=" + this.f47738i + ", mPreviousLayoutItemCount=" + this.f47733b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47734c + ", mStructureChanged=" + this.f47736f + ", mInPreLayout=" + this.f47737g + ", mRunSimpleAnimations=" + this.f47739j + ", mRunPredictiveAnimations=" + this.f47740k + '}';
    }
}
