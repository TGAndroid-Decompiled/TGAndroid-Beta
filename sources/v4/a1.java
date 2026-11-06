package v4;
public final class a1 {
    public int f56906a;
    public int f56907b;
    public int f56908c;
    public int d;
    public int f56909e;
    public boolean f56910f;
    public boolean f56911g;
    public boolean h;
    public boolean f56912i;
    public boolean f56913j;
    public boolean f56914k;
    public int f56915l;
    public long f56916m;
    public int f56917n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f56911g) {
            return this.f56907b - this.f56908c;
        }
        return this.f56909e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f56906a + ", mData=null, mItemCount=" + this.f56909e + ", mIsMeasuring=" + this.f56912i + ", mPreviousLayoutItemCount=" + this.f56907b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f56908c + ", mStructureChanged=" + this.f56910f + ", mInPreLayout=" + this.f56911g + ", mRunSimpleAnimations=" + this.f56913j + ", mRunPredictiveAnimations=" + this.f56914k + '}';
    }
}
