package v4;
public final class a1 {
    public int f57006a;
    public int f57007b;
    public int f57008c;
    public int d;
    public int f57009e;
    public boolean f57010f;
    public boolean f57011g;
    public boolean h;
    public boolean f57012i;
    public boolean f57013j;
    public boolean f57014k;
    public int f57015l;
    public long f57016m;
    public int f57017n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f57011g) {
            return this.f57007b - this.f57008c;
        }
        return this.f57009e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f57006a + ", mData=null, mItemCount=" + this.f57009e + ", mIsMeasuring=" + this.f57012i + ", mPreviousLayoutItemCount=" + this.f57007b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f57008c + ", mStructureChanged=" + this.f57010f + ", mInPreLayout=" + this.f57011g + ", mRunSimpleAnimations=" + this.f57013j + ", mRunPredictiveAnimations=" + this.f57014k + '}';
    }
}
