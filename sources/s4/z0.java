package s4;
public final class z0 {
    public int f45943a;
    public int f45944b;
    public int f45945c;
    public int d;
    public int f45946e;
    public boolean f45947f;
    public boolean f45948g;
    public boolean h;
    public boolean f45949i;
    public boolean f45950j;
    public boolean f45951k;
    public int f45952l;
    public long f45953m;
    public int f45954n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f45948g) {
            return this.f45944b - this.f45945c;
        }
        return this.f45946e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f45943a + ", mData=null, mItemCount=" + this.f45946e + ", mIsMeasuring=" + this.f45949i + ", mPreviousLayoutItemCount=" + this.f45944b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f45945c + ", mStructureChanged=" + this.f45947f + ", mInPreLayout=" + this.f45948g + ", mRunSimpleAnimations=" + this.f45950j + ", mRunPredictiveAnimations=" + this.f45951k + '}';
    }
}
