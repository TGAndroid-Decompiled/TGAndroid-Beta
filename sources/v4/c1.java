package v4;
public final class c1 {
    public int f59085a;
    public int f59086b;
    public int f59087c;
    public int d;
    public int f59088e;
    public boolean f59089f;
    public boolean f59090g;
    public boolean h;
    public boolean f59091i;
    public boolean f59092j;
    public boolean f59093k;
    public int f59094l;
    public long f59095m;
    public int f59096n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f59090g) {
            return this.f59086b - this.f59087c;
        }
        return this.f59088e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f59085a + ", mData=null, mItemCount=" + this.f59088e + ", mIsMeasuring=" + this.f59091i + ", mPreviousLayoutItemCount=" + this.f59086b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f59087c + ", mStructureChanged=" + this.f59089f + ", mInPreLayout=" + this.f59090g + ", mRunSimpleAnimations=" + this.f59092j + ", mRunPredictiveAnimations=" + this.f59093k + '}';
    }
}
