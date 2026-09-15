package s4;
public final class z0 {
    public int f42833a;
    public int f42834b;
    public int f42835c;
    public int d;
    public int e;
    public boolean f42836f;
    public boolean f42837g;
    public boolean h;
    public boolean f42838i;
    public boolean f42839j;
    public boolean f42840k;
    public int f42841l;
    public long f42842m;
    public int f42843n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f42837g) {
            return this.f42834b - this.f42835c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f42833a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f42838i + ", mPreviousLayoutItemCount=" + this.f42834b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f42835c + ", mStructureChanged=" + this.f42836f + ", mInPreLayout=" + this.f42837g + ", mRunSimpleAnimations=" + this.f42839j + ", mRunPredictiveAnimations=" + this.f42840k + '}';
    }
}
