package v4;
public final class c1 {
    public int f59210a;
    public int f59211b;
    public int f59212c;
    public int d;
    public int f59213e;
    public boolean f59214f;
    public boolean f59215g;
    public boolean h;
    public boolean f59216i;
    public boolean f59217j;
    public boolean f59218k;
    public int f59219l;
    public long f59220m;
    public int f59221n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f59215g) {
            return this.f59211b - this.f59212c;
        }
        return this.f59213e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f59210a + ", mData=null, mItemCount=" + this.f59213e + ", mIsMeasuring=" + this.f59216i + ", mPreviousLayoutItemCount=" + this.f59211b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f59212c + ", mStructureChanged=" + this.f59214f + ", mInPreLayout=" + this.f59215g + ", mRunSimpleAnimations=" + this.f59217j + ", mRunPredictiveAnimations=" + this.f59218k + '}';
    }
}
