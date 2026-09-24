package s4;
public final class z0 {
    public int f43104a;
    public int f43105b;
    public int f43106c;
    public int d;
    public int e;
    public boolean f43107f;
    public boolean f43108g;
    public boolean h;
    public boolean f43109i;
    public boolean f43110j;
    public boolean f43111k;
    public int f43112l;
    public long f43113m;
    public int f43114n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43108g) {
            return this.f43105b - this.f43106c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43104a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43109i + ", mPreviousLayoutItemCount=" + this.f43105b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43106c + ", mStructureChanged=" + this.f43107f + ", mInPreLayout=" + this.f43108g + ", mRunSimpleAnimations=" + this.f43110j + ", mRunPredictiveAnimations=" + this.f43111k + '}';
    }
}
