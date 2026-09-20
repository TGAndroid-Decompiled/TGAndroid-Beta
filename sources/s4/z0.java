package s4;
public final class z0 {
    public int f43132a;
    public int f43133b;
    public int f43134c;
    public int d;
    public int e;
    public boolean f43135f;
    public boolean f43136g;
    public boolean h;
    public boolean f43137i;
    public boolean f43138j;
    public boolean f43139k;
    public int f43140l;
    public long f43141m;
    public int f43142n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f43136g) {
            return this.f43133b - this.f43134c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f43132a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f43137i + ", mPreviousLayoutItemCount=" + this.f43133b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f43134c + ", mStructureChanged=" + this.f43135f + ", mInPreLayout=" + this.f43136g + ", mRunSimpleAnimations=" + this.f43138j + ", mRunPredictiveAnimations=" + this.f43139k + '}';
    }
}
