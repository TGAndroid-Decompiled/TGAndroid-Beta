package v4;
public final class c1 {
    public int f59128a;
    public int f59129b;
    public int f59130c;
    public int d;
    public int f59131e;
    public boolean f59132f;
    public boolean f59133g;
    public boolean h;
    public boolean f59134i;
    public boolean f59135j;
    public boolean f59136k;
    public int f59137l;
    public long f59138m;
    public int f59139n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f59133g) {
            return this.f59129b - this.f59130c;
        }
        return this.f59131e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f59128a + ", mData=null, mItemCount=" + this.f59131e + ", mIsMeasuring=" + this.f59134i + ", mPreviousLayoutItemCount=" + this.f59129b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f59130c + ", mStructureChanged=" + this.f59132f + ", mInPreLayout=" + this.f59133g + ", mRunSimpleAnimations=" + this.f59135j + ", mRunPredictiveAnimations=" + this.f59136k + '}';
    }
}
