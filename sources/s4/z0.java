package s4;
public final class z0 {
    public int f42860a;
    public int f42861b;
    public int f42862c;
    public int d;
    public int e;
    public boolean f42863f;
    public boolean f42864g;
    public boolean h;
    public boolean f42865i;
    public boolean f42866j;
    public boolean f42867k;
    public int f42868l;
    public long f42869m;
    public int f42870n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f42864g) {
            return this.f42861b - this.f42862c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f42860a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f42865i + ", mPreviousLayoutItemCount=" + this.f42861b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f42862c + ", mStructureChanged=" + this.f42863f + ", mInPreLayout=" + this.f42864g + ", mRunSimpleAnimations=" + this.f42866j + ", mRunPredictiveAnimations=" + this.f42867k + '}';
    }
}
