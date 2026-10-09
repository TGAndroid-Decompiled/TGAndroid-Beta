package s4;
public final class a1 {
    public int f47608a;
    public int f47609b;
    public int f47610c;
    public int d;
    public int f47611e;
    public boolean f47612f;
    public boolean f47613g;
    public boolean h;
    public boolean f47614i;
    public boolean f47615j;
    public boolean f47616k;
    public int f47617l;
    public long f47618m;
    public int f47619n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f47613g) {
            return this.f47609b - this.f47610c;
        }
        return this.f47611e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f47608a + ", mData=null, mItemCount=" + this.f47611e + ", mIsMeasuring=" + this.f47614i + ", mPreviousLayoutItemCount=" + this.f47609b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f47610c + ", mStructureChanged=" + this.f47612f + ", mInPreLayout=" + this.f47613g + ", mRunSimpleAnimations=" + this.f47615j + ", mRunPredictiveAnimations=" + this.f47616k + '}';
    }
}
