package v4;
public final class b1 {
    public int f58500a;
    public int f58501b;
    public int f58502c;
    public int d;
    public int f58503e;
    public boolean f58504f;
    public boolean f58505g;
    public boolean h;
    public boolean f58506i;
    public boolean f58507j;
    public boolean f58508k;
    public int f58509l;
    public long f58510m;
    public int f58511n;

    public final void a(int i7) {
        if ((this.d & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f58505g) {
            return this.f58501b - this.f58502c;
        }
        return this.f58503e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f58500a + ", mData=null, mItemCount=" + this.f58503e + ", mIsMeasuring=" + this.f58506i + ", mPreviousLayoutItemCount=" + this.f58501b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f58502c + ", mStructureChanged=" + this.f58504f + ", mInPreLayout=" + this.f58505g + ", mRunSimpleAnimations=" + this.f58507j + ", mRunPredictiveAnimations=" + this.f58508k + '}';
    }
}
