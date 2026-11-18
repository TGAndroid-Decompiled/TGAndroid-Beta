package v4;
public final class c1 {
    public int f59086a;
    public int f59087b;
    public int f59088c;
    public int d;
    public int f59089e;
    public boolean f59090f;
    public boolean f59091g;
    public boolean h;
    public boolean f59092i;
    public boolean f59093j;
    public boolean f59094k;
    public int f59095l;
    public long f59096m;
    public int f59097n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f59091g) {
            return this.f59087b - this.f59088c;
        }
        return this.f59089e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f59086a + ", mData=null, mItemCount=" + this.f59089e + ", mIsMeasuring=" + this.f59092i + ", mPreviousLayoutItemCount=" + this.f59087b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f59088c + ", mStructureChanged=" + this.f59090f + ", mInPreLayout=" + this.f59091g + ", mRunSimpleAnimations=" + this.f59093j + ", mRunPredictiveAnimations=" + this.f59094k + '}';
    }
}
