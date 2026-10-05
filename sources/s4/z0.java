package s4;
public final class z0 {
    public int f46715a;
    public int f46716b;
    public int f46717c;
    public int d;
    public int f46718e;
    public boolean f46719f;
    public boolean f46720g;
    public boolean h;
    public boolean f46721i;
    public boolean f46722j;
    public boolean f46723k;
    public int f46724l;
    public long f46725m;
    public int f46726n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46720g) {
            return this.f46716b - this.f46717c;
        }
        return this.f46718e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46715a + ", mData=null, mItemCount=" + this.f46718e + ", mIsMeasuring=" + this.f46721i + ", mPreviousLayoutItemCount=" + this.f46716b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46717c + ", mStructureChanged=" + this.f46719f + ", mInPreLayout=" + this.f46720g + ", mRunSimpleAnimations=" + this.f46722j + ", mRunPredictiveAnimations=" + this.f46723k + '}';
    }
}
