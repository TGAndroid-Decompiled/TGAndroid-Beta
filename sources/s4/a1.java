package s4;

import ai.be;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
public final class a1 implements Runnable {
    public int f45898a;
    public int f45899b;
    public OverScroller f45900c;
    public Interpolator d;
    public boolean e;
    public boolean f45901f;
    public final RecyclerView h;

    public a1(RecyclerView recyclerView) {
        this.h = recyclerView;
        be beVar = RecyclerView.R0;
        this.d = beVar;
        this.e = false;
        this.f45901f = false;
        this.f45900c = new OverScroller(recyclerView.getContext(), beVar);
    }

    public final void a() {
        if (this.e) {
            this.f45901f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.i0.f44829a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        boolean z10;
        int height;
        int i13;
        RecyclerView recyclerView = this.h;
        if (i12 == Integer.MIN_VALUE) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            int i14 = height / 2;
            float f7 = height;
            float f10 = i14;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f10) + f10;
            if (sqrt > 0) {
                i13 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i13 = (int) (((abs / f7) + 1.0f) * 300.0f);
            }
            i12 = Math.min(i13, 2000);
        }
        int i15 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.R0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f45900c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f45899b = 0;
        this.f45898a = 0;
        recyclerView.setScrollState(2);
        this.f45900c.startScroll(0, 0, i10, i11, i15);
        a();
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean awakenScrollBars;
        boolean z10;
        boolean z11;
        boolean z12;
        int i14;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.J0;
        if (recyclerView.f3631x == null) {
            recyclerView.O0 = true;
            recyclerView.removeCallbacks(this);
            this.f45900c.abortAnimation();
            return;
        }
        this.f45901f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.f45900c;
        recyclerView.P0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f45898a;
            int i16 = currY - this.f45899b;
            this.f45898a = currX;
            this.f45899b = currY;
            int[] iArr2 = recyclerView.J0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(i15, i16, 1, iArr2, null)) {
                i10 = i15 - iArr[0];
                i11 = i16 - iArr[1];
            } else {
                i10 = i15;
                i11 = i16;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(i10, i11);
            }
            if (recyclerView.f3629w != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.t0(i10, i11, iArr);
                i12 = iArr[0];
                i13 = iArr[1];
                i10 -= i12;
                i11 -= i13;
                x0 x0Var = recyclerView.f3631x.e;
                if (x0Var != null && !x0Var.d && x0Var.e) {
                    int b10 = recyclerView.f3627u0.b();
                    if (b10 == 0) {
                        x0Var.h();
                    } else if (x0Var.f46061a >= b10) {
                        x0Var.f46061a = b10 - 1;
                        x0Var.c(i12, i13);
                    } else {
                        x0Var.c(i12, i13);
                    }
                }
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f3633y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.J0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i12, i13, i10, i11, null, 1, iArr3);
            int i17 = i10 - iArr[0];
            int i18 = i11 - iArr[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.x(i12, i13);
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
            if (!overScroller.isFinished() && ((!z10 && i17 == 0) || (!z11 && i18 == 0))) {
                z12 = false;
            } else {
                z12 = true;
            }
            x0 x0Var2 = recyclerView.f3631x.e;
            if ((x0Var2 == null || !x0Var2.d) && z12) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i17 < 0) {
                        i14 = -currVelocity;
                    } else if (i17 > 0) {
                        i14 = currVelocity;
                    } else {
                        i14 = 0;
                    }
                    if (i18 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i18 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.z();
                        if (recyclerView.V.isFinished()) {
                            recyclerView.V.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.A();
                        if (recyclerView.f3602a0.isFinished()) {
                            recyclerView.f3602a0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.W.isFinished()) {
                            recyclerView.W.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.f3604b0.isFinished()) {
                            recyclerView.f3604b0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = r0.i0.f44829a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                e2.f fVar = recyclerView.f3626t0;
                int[] iArr4 = (int[]) fVar.f8223c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                fVar.d = 0;
            } else {
                a();
                q qVar = recyclerView.f3625s0;
                if (qVar != null) {
                    qVar.a(recyclerView, i12, i13);
                }
            }
        }
        recyclerView.P0 = false;
        x0 x0Var3 = recyclerView.f3631x.e;
        if (x0Var3 != null && x0Var3.d) {
            x0Var3.c(0, 0);
        }
        this.e = false;
        if (this.f45901f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.i0.f44829a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.A0(1);
    }
}
