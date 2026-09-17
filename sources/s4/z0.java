package s4;
public final class z0 {
    public int f45916a;
    public int f45917b;
    public int f45918c;
    public int d;
    public int f45919e;
    public boolean f45920f;
    public boolean f45921g;
    public boolean h;
    public boolean f45922i;
    public boolean f45923j;
    public boolean f45924k;
    public int f45925l;
    public long f45926m;
    public int f45927n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f45921g) {
            return this.f45917b - this.f45918c;
        }
        return this.f45919e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f45916a + ", mData=null, mItemCount=" + this.f45919e + ", mIsMeasuring=" + this.f45922i + ", mPreviousLayoutItemCount=" + this.f45917b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f45918c + ", mStructureChanged=" + this.f45920f + ", mInPreLayout=" + this.f45921g + ", mRunSimpleAnimations=" + this.f45923j + ", mRunPredictiveAnimations=" + this.f45924k + '}';
    }
}
