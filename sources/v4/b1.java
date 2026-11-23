package v4;
public final class b1 {
    public int f59075a;
    public int f59076b;
    public int f59077c;
    public int d;
    public int f59078e;
    public boolean f59079f;
    public boolean f59080g;
    public boolean h;
    public boolean f59081i;
    public boolean f59082j;
    public boolean f59083k;
    public int f59084l;
    public long f59085m;
    public int f59086n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f59080g) {
            return this.f59076b - this.f59077c;
        }
        return this.f59078e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f59075a + ", mData=null, mItemCount=" + this.f59078e + ", mIsMeasuring=" + this.f59081i + ", mPreviousLayoutItemCount=" + this.f59076b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f59077c + ", mStructureChanged=" + this.f59079f + ", mInPreLayout=" + this.f59080g + ", mRunSimpleAnimations=" + this.f59082j + ", mRunPredictiveAnimations=" + this.f59083k + '}';
    }
}
