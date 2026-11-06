package v4;
public final class a1 {
    public int f56881a;
    public int f56882b;
    public int f56883c;
    public int d;
    public int f56884e;
    public boolean f56885f;
    public boolean f56886g;
    public boolean h;
    public boolean f56887i;
    public boolean f56888j;
    public boolean f56889k;
    public int f56890l;
    public long f56891m;
    public int f56892n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f56886g) {
            return this.f56882b - this.f56883c;
        }
        return this.f56884e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f56881a + ", mData=null, mItemCount=" + this.f56884e + ", mIsMeasuring=" + this.f56887i + ", mPreviousLayoutItemCount=" + this.f56882b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f56883c + ", mStructureChanged=" + this.f56885f + ", mInPreLayout=" + this.f56886g + ", mRunSimpleAnimations=" + this.f56888j + ", mRunPredictiveAnimations=" + this.f56889k + '}';
    }
}
