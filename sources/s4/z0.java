package s4;
public final class z0 {
    public int f42855a;
    public int f42856b;
    public int f42857c;
    public int d;
    public int e;
    public boolean f42858f;
    public boolean f42859g;
    public boolean h;
    public boolean f42860i;
    public boolean f42861j;
    public boolean f42862k;
    public int f42863l;
    public long f42864m;
    public int f42865n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f42859g) {
            return this.f42856b - this.f42857c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f42855a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f42860i + ", mPreviousLayoutItemCount=" + this.f42856b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f42857c + ", mStructureChanged=" + this.f42858f + ", mInPreLayout=" + this.f42859g + ", mRunSimpleAnimations=" + this.f42861j + ", mRunPredictiveAnimations=" + this.f42862k + '}';
    }
}
