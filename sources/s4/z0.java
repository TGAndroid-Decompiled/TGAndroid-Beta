package s4;
public final class z0 {
    public int f41768a;
    public int f41769b;
    public int f41770c;
    public int d;
    public int e;
    public boolean f41771f;
    public boolean f41772g;
    public boolean h;
    public boolean f41773i;
    public boolean f41774j;
    public boolean f41775k;
    public int f41776l;
    public long f41777m;
    public int f41778n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f41772g) {
            return this.f41769b - this.f41770c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f41768a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f41773i + ", mPreviousLayoutItemCount=" + this.f41769b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f41770c + ", mStructureChanged=" + this.f41771f + ", mInPreLayout=" + this.f41772g + ", mRunSimpleAnimations=" + this.f41774j + ", mRunPredictiveAnimations=" + this.f41775k + '}';
    }
}
