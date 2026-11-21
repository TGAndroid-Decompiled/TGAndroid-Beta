package v4;
public final class c1 {
    public int f59124a;
    public int f59125b;
    public int f59126c;
    public int d;
    public int f59127e;
    public boolean f59128f;
    public boolean f59129g;
    public boolean h;
    public boolean f59130i;
    public boolean f59131j;
    public boolean f59132k;
    public int f59133l;
    public long f59134m;
    public int f59135n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f59129g) {
            return this.f59125b - this.f59126c;
        }
        return this.f59127e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f59124a + ", mData=null, mItemCount=" + this.f59127e + ", mIsMeasuring=" + this.f59130i + ", mPreviousLayoutItemCount=" + this.f59125b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f59126c + ", mStructureChanged=" + this.f59128f + ", mInPreLayout=" + this.f59129g + ", mRunSimpleAnimations=" + this.f59131j + ", mRunPredictiveAnimations=" + this.f59132k + '}';
    }
}
