package s4;
public final class z0 {
    public int f48053a;
    public int f48054b;
    public int f48055c;
    public int d;
    public int e;
    public boolean f48056f;
    public boolean f48057g;
    public boolean h;
    public boolean f48058i;
    public boolean f48059j;
    public boolean f48060k;
    public int f48061l;
    public long f48062m;
    public int f48063n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f48057g) {
            return this.f48054b - this.f48055c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f48053a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f48058i + ", mPreviousLayoutItemCount=" + this.f48054b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f48055c + ", mStructureChanged=" + this.f48056f + ", mInPreLayout=" + this.f48057g + ", mRunSimpleAnimations=" + this.f48059j + ", mRunPredictiveAnimations=" + this.f48060k + '}';
    }
}
