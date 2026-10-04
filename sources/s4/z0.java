package s4;
public final class z0 {
    public int f46708a;
    public int f46709b;
    public int f46710c;
    public int d;
    public int f46711e;
    public boolean f46712f;
    public boolean f46713g;
    public boolean h;
    public boolean f46714i;
    public boolean f46715j;
    public boolean f46716k;
    public int f46717l;
    public long f46718m;
    public int f46719n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f46713g) {
            return this.f46709b - this.f46710c;
        }
        return this.f46711e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f46708a + ", mData=null, mItemCount=" + this.f46711e + ", mIsMeasuring=" + this.f46714i + ", mPreviousLayoutItemCount=" + this.f46709b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f46710c + ", mStructureChanged=" + this.f46712f + ", mInPreLayout=" + this.f46713g + ", mRunSimpleAnimations=" + this.f46715j + ", mRunPredictiveAnimations=" + this.f46716k + '}';
    }
}
