package u4;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
public final class c1 implements Runnable {
    public int f55532a;
    public int f55533b;
    public OverScroller f55534c;
    public Interpolator d;
    public boolean f55535e;
    public boolean f55536f;
    public final RecyclerView h;

    public c1(RecyclerView recyclerView) {
        this.h = recyclerView;
        b5.c cVar = RecyclerView.S0;
        this.d = cVar;
        this.f55535e = false;
        this.f55536f = false;
        this.f55534c = new OverScroller(recyclerView.getContext(), cVar);
    }

    public final void a() {
        if (this.f55535e) {
            this.f55536f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i3, int i10, int i11, Interpolator interpolator) {
        boolean z10;
        int height;
        int i12;
        RecyclerView recyclerView = this.h;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i10);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i10 * i10) + (i3 * i3));
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
            this.f55534c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f55533b = 0;
        this.f55532a = 0;
        recyclerView.setScrollState(2);
        this.f55534c.startScroll(0, 0, i3, i10, i14);
        a();
    }

    @Override
    public final void run() {
        int i3;
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
        if (recyclerView.f2305y == null) {
            recyclerView.P0 = true;
            recyclerView.removeCallbacks(this);
            this.f55534c.abortAnimation();
            return;
        }
        this.f55536f = false;
        this.f55535e = true;
        recyclerView.p();
        OverScroller overScroller = this.f55534c;
        recyclerView.Q0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f55532a;
            int i15 = currY - this.f55533b;
            this.f55532a = currX;
            this.f55533b = currY;
            int[] iArr2 = recyclerView.K0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(i14, i15, 1, iArr2, null)) {
                i3 = i14 - iArr[0];
                i10 = i15 - iArr[1];
            } else {
                i3 = i14;
                i10 = i15;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(i3, i10);
            }
            if (recyclerView.f2303x != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.u0(i3, i10, iArr);
                i11 = iArr[0];
                i12 = iArr[1];
                i3 -= i11;
                i10 -= i12;
                z0 z0Var = recyclerView.f2305y.f55632e;
                if (z0Var != null && !z0Var.d && z0Var.f55707e) {
                    int b10 = recyclerView.f2300v0.b();
                    if (b10 == 0) {
                        z0Var.h();
                    } else if (z0Var.f55704a >= b10) {
                        z0Var.f55704a = b10 - 1;
                        z0Var.c(i11, i12);
                    } else {
                        z0Var.c(i11, i12);
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
            recyclerView.w(i11, i12, i3, i10, null, 1, iArr3);
            int i16 = i3 - iArr[0];
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
            z0 z0Var2 = recyclerView.f2305y.f55632e;
            if ((z0Var2 == null || !z0Var2.d) && z12) {
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
                            if (recyclerView.f2275b0.isFinished()) {
                                recyclerView.f2275b0.onAbsorb(i13);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.B();
                            if (recyclerView.f2273a0.isFinished()) {
                                recyclerView.f2273a0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.y();
                            if (recyclerView.f2277c0.isFinished()) {
                                recyclerView.f2277c0.onAbsorb(currVelocity);
                            }
                        }
                        if (i13 != 0 || currVelocity != 0) {
                            WeakHashMap weakHashMap = r0.i0.f54015a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                }
                g2.g gVar = recyclerView.f2299u0;
                int[] iArr4 = gVar.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                gVar.f11843c = 0;
            } else {
                a();
                q qVar = recyclerView.f2298t0;
                if (qVar != null) {
                    qVar.a(recyclerView, i11, i12);
                }
            }
        }
        recyclerView.Q0 = false;
        z0 z0Var3 = recyclerView.f2305y.f55632e;
        if (z0Var3 != null && z0Var3.d) {
            z0Var3.c(0, 0);
        }
        this.f55535e = false;
        if (this.f55536f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.i0.f54015a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.B0(1);
    }
}
