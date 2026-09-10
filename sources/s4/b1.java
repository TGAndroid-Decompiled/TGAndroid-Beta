package s4;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.ui.Cells.l2;
public final class b1 implements Runnable {
    public int f41592a;
    public int f41593b;
    public OverScroller f41594c;
    public Interpolator d;
    public boolean e;
    public boolean f41595f;
    public final RecyclerView h;

    public b1(RecyclerView recyclerView) {
        this.h = recyclerView;
        l2 l2Var = RecyclerView.T0;
        this.d = l2Var;
        this.e = false;
        this.f41595f = false;
        this.f41594c = new OverScroller(recyclerView.getContext(), l2Var);
    }

    public final void a() {
        if (this.e) {
            this.f41595f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.i0.f41062a;
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
            interpolator = RecyclerView.T0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f41594c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f41593b = 0;
        this.f41592a = 0;
        recyclerView.setScrollState(2);
        this.f41594c.startScroll(0, 0, i10, i11, i15);
        if (Build.VERSION.SDK_INT < 23) {
            this.f41594c.computeScrollOffset();
        }
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
        int[] iArr = recyclerView.I0;
        if (recyclerView.f1560x == null) {
            recyclerView.N0 = true;
            recyclerView.removeCallbacks(this);
            this.f41594c.abortAnimation();
            return;
        }
        this.f41595f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.f41594c;
        recyclerView.O0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f41592a;
            int i16 = currY - this.f41593b;
            this.f41592a = currX;
            this.f41593b = currY;
            int[] iArr2 = recyclerView.I0;
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
            if (recyclerView.f1558w != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.t0(i10, i11, iArr);
                i12 = iArr[0];
                i13 = iArr[1];
                i10 -= i12;
                i11 -= i13;
                y0 y0Var = recyclerView.f1560x.e;
                if (y0Var != null && !y0Var.d && y0Var.e) {
                    int b10 = recyclerView.f1555t0.b();
                    if (b10 == 0) {
                        y0Var.h();
                    } else if (y0Var.f41760a >= b10) {
                        y0Var.f41760a = b10 - 1;
                        y0Var.c(i12, i13);
                    } else {
                        y0Var.c(i12, i13);
                    }
                }
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f1562y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.I0;
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
            y0 y0Var2 = recyclerView.f1560x.e;
            if ((y0Var2 == null || !y0Var2.d) && z12) {
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
                        if (recyclerView.f1531a0.isFinished()) {
                            recyclerView.f1531a0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.W.isFinished()) {
                            recyclerView.W.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.f1533b0.isFinished()) {
                            recyclerView.f1533b0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = r0.i0.f41062a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.S0) {
                    a0.h hVar = recyclerView.f1554s0;
                    int[] iArr4 = (int[]) hVar.f16c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    hVar.d = 0;
                }
            } else {
                a();
                q qVar = recyclerView.f1552r0;
                if (qVar != null) {
                    qVar.a(recyclerView, i12, i13);
                }
            }
        }
        recyclerView.O0 = false;
        y0 y0Var3 = recyclerView.f1560x.e;
        if (y0Var3 != null && y0Var3.d) {
            y0Var3.c(0, 0);
        }
        this.e = false;
        if (this.f41595f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.i0.f41062a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.A0(1);
    }
}
