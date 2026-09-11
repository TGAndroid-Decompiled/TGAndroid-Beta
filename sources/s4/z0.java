package s4;
public final class z0 {
    public int f45915a;
    public int f45916b;
    public int f45917c;
    public int d;
    public int f45918e;
    public boolean f45919f;
    public boolean f45920g;
    public boolean h;
    public boolean f45921i;
    public boolean f45922j;
    public boolean f45923k;
    public int f45924l;
    public long f45925m;
    public int f45926n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f45920g) {
            return this.f45916b - this.f45917c;
        }
        return this.f45918e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f45915a + ", mData=null, mItemCount=" + this.f45918e + ", mIsMeasuring=" + this.f45921i + ", mPreviousLayoutItemCount=" + this.f45916b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f45917c + ", mStructureChanged=" + this.f45919f + ", mInPreLayout=" + this.f45920g + ", mRunSimpleAnimations=" + this.f45922j + ", mRunPredictiveAnimations=" + this.f45923k + '}';
    }
}
