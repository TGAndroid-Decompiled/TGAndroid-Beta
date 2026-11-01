package org.telegram.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class vb0 extends org.telegram.ui.Components.vu0 implements r0.l {
    public final int f42471f0 = 1;
    public final ac.g f42472g0;
    public boolean f42473h0;
    public final org.telegram.ui.ActionBar.k2 f42474i0;

    public vb0(org.telegram.ui.Wallet.b6 b6Var, Context context) {
        super(context, null);
        this.f42474i0 = b6Var;
        this.f42472g0 = new Object();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.x5 x5Var = ((org.telegram.ui.Wallet.b6) this.f42474i0).f34260q0;
        if (x5Var != null) {
            x5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.f42474i0;
        jg.z2 z2Var = b6Var.f34257n0;
        if (z2Var != null && (z2Var.getParent() instanceof View) && ((View) b6Var.f34257n0.getParent()).getTop() <= b6Var.f30217a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public int b0(org.telegram.ui.Components.v51 v51Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.cu0 cu0Var = new org.telegram.ui.Components.cu0(iArr, 7);
        this.f42473h0 = true;
        v51Var.j(cu0Var);
        try {
            v51Var.scrollBy(0, i10);
            ArrayList arrayList = v51Var.f1921w0;
            if (arrayList != null) {
                arrayList.remove(cu0Var);
            }
            this.f42473h0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = v51Var.f1921w0;
            if (arrayList2 != null) {
                arrayList2.remove(cu0Var);
            }
            this.f42473h0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vb0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f42471f0) {
            case 1:
                return this.f42472g0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void k(int i10, View view) {
        switch (this.f42471f0) {
            case 0:
                this.f42472g0.f385a = 0;
                return;
            default:
                ac.g gVar = this.f42472g0;
                if (i10 == 1) {
                    gVar.f386b = 0;
                } else {
                    gVar.f385a = 0;
                }
                org.telegram.ui.Wallet.x5 x5Var = ((org.telegram.ui.Wallet.b6) this.f42474i0).f34260q0;
                if (x5Var != null) {
                    org.telegram.ui.Wallet.l lVar = x5Var.f35393i;
                    org.telegram.ui.Components.ii iiVar = x5Var.f35390c;
                    if (iiVar != null) {
                        iiVar.removeCallbacks(lVar);
                        x5Var.f35390c.post(lVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        pb0 pb0Var;
        org.telegram.ui.Components.v51 y02;
        switch (this.f42471f0) {
            case 0:
                xb0 xb0Var = (xb0) this.f42474i0;
                try {
                    if (view == xb0Var.S && (pb0Var = xb0Var.S0) != null && pb0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.uk0 currentListView = xb0Var.S0.getCurrentListView();
                        int top = xb0Var.S0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                    org.telegram.messenger.i0.g3(new yy(this, 20));
                    return;
                }
            default:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.f42474i0;
                if (!this.f42473h0 && i13 != 0 && (y02 = b6Var.y0()) != null) {
                    if (view == b6Var.f30217a && Y()) {
                        iArr[1] = b0(y02, i13) + iArr[1];
                        return;
                    } else if (view == y02 && i13 < 0) {
                        iArr[1] = b0(b6Var.f30217a, i13) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f42471f0) {
            case 0:
                return;
            default:
                l(view, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    @Override
    public final boolean n(View view, View view2, int i10, int i11) {
        switch (this.f42471f0) {
            case 0:
                if (((xb0) this.f42474i0).S0 != null && i10 == 2) {
                    return true;
                }
                return false;
            default:
                if ((i10 & 2) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f42471f0) {
            case 0:
                xb0 xb0Var = (xb0) this.f42474i0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    xb0Var.u0(this.f42473h0);
                    this.f42473h0 = false;
                    return;
                }
                xb0Var.P0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f42471f0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.f42474i0;
                if (b6Var.f34261r != size) {
                    b6Var.f34261r = size;
                    org.telegram.ui.Wallet.o5 o5Var = b6Var.e;
                    if (o5Var != null) {
                        o5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.l5 l5Var = b6Var.f34248f;
                    if (l5Var != null) {
                        l5Var.requestLayout();
                    }
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onNestedPreFling(View view, float f7, float f10) {
        org.telegram.ui.Wallet.x5 x5Var;
        switch (this.f42471f0) {
            case 1:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.f42474i0;
                if (view == b6Var.y0() && (x5Var = b6Var.f34260q0) != null) {
                    return x5Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f42471f0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final void q(View view, View view2, int i10, int i11) {
        switch (this.f42471f0) {
            case 0:
                this.f42472g0.f385a = i10;
                return;
            default:
                ac.g gVar = this.f42472g0;
                if (i11 == 1) {
                    gVar.f386b = i10;
                    return;
                } else {
                    gVar.f385a = i10;
                    return;
                }
        }
    }

    @Override
    public final void s(android.view.View r6, int r7, int r8, int[] r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vb0.s(android.view.View, int, int, int[], int):void");
    }

    public vb0(xb0 xb0Var, Context context) {
        super(context, null);
        this.f42474i0 = xb0Var;
        this.f42473h0 = true;
        this.f42472g0 = new Object();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
