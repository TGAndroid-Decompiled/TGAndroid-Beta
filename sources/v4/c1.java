package v4;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import bi.sd;
import java.util.Arrays;
import java.util.WeakHashMap;
public final class c1 implements Runnable {
    public int f57047a;
    public int f57048b;
    public OverScroller f57049c;
    public Interpolator d;
    public boolean f57050e;
    public boolean f57051f;
    public final RecyclerView h;

    public c1(RecyclerView recyclerView) {
        this.h = recyclerView;
        sd sdVar = RecyclerView.R0;
        this.d = sdVar;
        this.f57050e = false;
        this.f57051f = false;
        this.f57049c = new OverScroller(recyclerView.getContext(), sdVar);
    }

    public final void a() {
        if (this.f57050e) {
            this.f57051f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        boolean z9;
        int height;
        int i12;
        RecyclerView recyclerView = this.h;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i7);
            int abs2 = Math.abs(i10);
            if (abs > abs2) {
                z9 = true;
            } else {
                z9 = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i10 * i10) + (i7 * i7));
            if (z9) {
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
                if (!z9) {
                    abs = abs2;
                }
                i12 = (int) (((abs / f10) + 1.0f) * 300.0f);
            }
            i11 = Math.min(i12, 2000);
        }
        int i14 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.R0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f57049c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f57048b = 0;
        this.f57047a = 0;
        recyclerView.setScrollState(2);
        this.f57049c.startScroll(0, 0, i7, i10, i14);
        a();
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        boolean z9;
        boolean z10;
        boolean z11;
        int i13;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.J0;
        if (recyclerView.f2873y == null) {
            recyclerView.O0 = true;
            recyclerView.removeCallbacks(this);
            this.f57049c.abortAnimation();
            return;
        }
        this.f57051f = false;
        this.f57050e = true;
        recyclerView.p();
        OverScroller overScroller = this.f57049c;
        recyclerView.P0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f57047a;
            int i15 = currY - this.f57048b;
            this.f57047a = currX;
            this.f57048b = currY;
            int[] iArr2 = recyclerView.J0;
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
            if (recyclerView.f2871x != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.u0(i7, i10, iArr);
                i11 = iArr[0];
                i12 = iArr[1];
                i7 -= i11;
                i10 -= i12;
                z0 z0Var = recyclerView.f2873y.f57146e;
                if (z0Var != null && !z0Var.d && z0Var.f57228e) {
                    int b10 = recyclerView.f2867u0.b();
                    if (b10 == 0) {
                        z0Var.h();
                    } else if (z0Var.f57225a >= b10) {
                        z0Var.f57225a = b10 - 1;
                        z0Var.c(i11, i12);
                    } else {
                        z0Var.c(i11, i12);
                    }
                }
            } else {
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.D.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.J0;
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
                z9 = true;
            } else {
                z9 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!overScroller.isFinished() && ((!z9 && i16 == 0) || (!z10 && i17 == 0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            z0 z0Var2 = recyclerView.f2873y.f57146e;
            if ((z0Var2 == null || !z0Var2.d) && z11) {
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
                    Integer num = recyclerView.I0;
                    if (num == null || num.intValue() != 0) {
                        if (i13 < 0) {
                            recyclerView.z();
                            if (recyclerView.V.isFinished()) {
                                recyclerView.V.onAbsorb(-i13);
                            }
                        } else if (i13 > 0) {
                            recyclerView.A();
                            if (recyclerView.f2841a0.isFinished()) {
                                recyclerView.f2841a0.onAbsorb(i13);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.B();
                            if (recyclerView.W.isFinished()) {
                                recyclerView.W.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.y();
                            if (recyclerView.f2843b0.isFinished()) {
                                recyclerView.f2843b0.onAbsorb(currVelocity);
                            }
                        }
                        if (i13 != 0 || currVelocity != 0) {
                            WeakHashMap weakHashMap = r0.i0.f54203a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                }
                h2.f fVar = recyclerView.f2866t0;
                int[] iArr4 = fVar.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                fVar.f14082c = 0;
            } else {
                a();
                q qVar = recyclerView.f2865s0;
                if (qVar != null) {
                    qVar.a(recyclerView, i11, i12);
                }
            }
        }
        recyclerView.P0 = false;
        z0 z0Var3 = recyclerView.f2873y.f57146e;
        if (z0Var3 != null && z0Var3.d) {
            z0Var3.c(0, 0);
        }
        this.f57050e = false;
        if (this.f57051f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.i0.f54203a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.B0(1);
    }
}
