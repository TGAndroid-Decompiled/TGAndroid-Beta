package v4;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
public final class e1 implements Runnable {
    public int f59236a;
    public int f59237b;
    public OverScroller f59238c;
    public Interpolator d;
    public boolean f59239e;
    public boolean f59240f;
    public final RecyclerView h;

    public e1(RecyclerView recyclerView) {
        this.h = recyclerView;
        c5.c cVar = RecyclerView.S0;
        this.d = cVar;
        this.f59239e = false;
        this.f59240f = false;
        this.f59238c = new OverScroller(recyclerView.getContext(), cVar);
    }

    public final void a() {
        if (this.f59239e) {
            this.f59240f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        boolean z10;
        int height;
        int i12;
        RecyclerView recyclerView = this.h;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i7);
            int abs2 = Math.abs(i10);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i10 * i10) + (i7 * i7));
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            int i13 = height / 2;
            float f10 = height;
            float f11 = i13;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
            if (sqrt > 0) {
                i12 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i12 = (int) (((abs / f10) + 1.0f) * 300.0f);
            }
            i11 = Math.min(i12, 2000);
        }
        int i14 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.S0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f59238c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f59237b = 0;
        this.f59236a = 0;
        recyclerView.setScrollState(2);
        this.f59238c.startScroll(0, 0, i7, i10, i14);
        a();
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.K0;
        if (recyclerView.f2793y == null) {
            recyclerView.P0 = true;
            recyclerView.removeCallbacks(this);
            this.f59238c.abortAnimation();
            return;
        }
        this.f59240f = false;
        this.f59239e = true;
        recyclerView.p();
        OverScroller overScroller = this.f59238c;
        recyclerView.Q0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f59236a;
            int i15 = currY - this.f59237b;
            this.f59236a = currX;
            this.f59237b = currY;
            int[] iArr2 = recyclerView.K0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(i14, i15, 1, iArr2, null)) {
                i7 = i14 - iArr[0];
                i10 = i15 - iArr[1];
            } else {
                i7 = i14;
                i10 = i15;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(i7, i10);
            }
            if (recyclerView.f2791x != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.u0(i7, i10, iArr);
                i11 = iArr[0];
                i12 = iArr[1];
                i7 -= i11;
                i10 -= i12;
                b1 b1Var = recyclerView.f2793y.f59334e;
                if (b1Var != null && !b1Var.d && b1Var.f59193e) {
                    int b10 = recyclerView.f2788v0.b();
                    if (b10 == 0) {
                        b1Var.h();
                    } else if (b1Var.f59190a >= b10) {
                        b1Var.f59190a = b10 - 1;
                        b1Var.c(i11, i12);
                    } else {
                        b1Var.c(i11, i12);
                    }
                }
            } else {
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.E.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.K0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i11, i12, i7, i10, null, 1, iArr3);
            int i16 = i7 - iArr[0];
            int i17 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.x(i11, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!overScroller.isFinished() && ((!z10 && i16 == 0) || (!z11 && i17 == 0))) {
                z12 = false;
            } else {
                z12 = true;
            }
            b1 b1Var2 = recyclerView.f2793y.f59334e;
            if ((b1Var2 == null || !b1Var2.d) && z12) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i16 < 0) {
                        i13 = -currVelocity;
                    } else if (i16 > 0) {
                        i13 = currVelocity;
                    } else {
                        i13 = 0;
                    }
                    if (i17 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i17 <= 0) {
                        currVelocity = 0;
                    }
                    Integer num = recyclerView.J0;
                    if (num == null || num.intValue() != 0) {
                        if (i13 < 0) {
                            recyclerView.z();
                            if (recyclerView.W.isFinished()) {
                                recyclerView.W.onAbsorb(-i13);
                            }
                        } else if (i13 > 0) {
                            recyclerView.A();
                            if (recyclerView.f2763b0.isFinished()) {
                                recyclerView.f2763b0.onAbsorb(i13);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.B();
                            if (recyclerView.f2761a0.isFinished()) {
                                recyclerView.f2761a0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.y();
                            if (recyclerView.f2765c0.isFinished()) {
                                recyclerView.f2765c0.onAbsorb(currVelocity);
                            }
                        }
                        if (i13 != 0 || currVelocity != 0) {
                            WeakHashMap weakHashMap = r0.i0.f56367a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                }
                h2.f fVar = recyclerView.f2787u0;
                int[] iArr4 = fVar.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                fVar.f13749c = 0;
            } else {
                a();
                r rVar = recyclerView.f2786t0;
                if (rVar != null) {
                    rVar.a(recyclerView, i11, i12);
                }
            }
        }
        recyclerView.Q0 = false;
        b1 b1Var3 = recyclerView.f2793y.f59334e;
        if (b1Var3 != null && b1Var3.d) {
            b1Var3.c(0, 0);
        }
        this.f59239e = false;
        if (this.f59240f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.i0.f56367a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.B0(1);
    }
}
