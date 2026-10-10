package s4;
public final class a1 {
    public int f47652a;
    public int f47653b;
    public int f47654c;
    public int d;
    public int f47655e;
    public boolean f47656f;
    public boolean f47657g;
    public boolean h;
    public boolean f47658i;
    public boolean f47659j;
    public boolean f47660k;
    public int f47661l;
    public long f47662m;
    public int f47663n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47657g) {
            return this.f47653b - this.f47654c;
        }
        return this.f47655e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47652a + ", mData=null, mItemCount=" + this.f47655e + ", mIsMeasuring=" + this.f47658i + ", mPreviousLayoutItemCount=" + this.f47653b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47654c + ", mStructureChanged=" + this.f47656f + ", mInPreLayout=" + this.f47657g + ", mRunSimpleAnimations=" + this.f47659j + ", mRunPredictiveAnimations=" + this.f47660k + '}';
    }
}
