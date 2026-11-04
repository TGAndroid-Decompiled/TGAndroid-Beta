package u4;
public final class a1 {
    public int f55490a;
    public int f55491b;
    public int f55492c;
    public int d;
    public int f55493e;
    public boolean f55494f;
    public boolean f55495g;
    public boolean h;
    public boolean f55496i;
    public boolean f55497j;
    public boolean f55498k;
    public int f55499l;
    public long f55500m;
    public int f55501n;

    public final void a(int i3) {
        if ((this.d & i3) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i3) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f55495g) {
            return this.f55491b - this.f55492c;
        }
        return this.f55493e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f55490a + ", mData=null, mItemCount=" + this.f55493e + ", mIsMeasuring=" + this.f55496i + ", mPreviousLayoutItemCount=" + this.f55491b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f55492c + ", mStructureChanged=" + this.f55494f + ", mInPreLayout=" + this.f55495g + ", mRunSimpleAnimations=" + this.f55497j + ", mRunPredictiveAnimations=" + this.f55498k + '}';
    }
}
