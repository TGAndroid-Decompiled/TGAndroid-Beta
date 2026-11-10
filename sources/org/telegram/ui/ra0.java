package org.telegram.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class ra0 extends org.telegram.ui.Components.st0 implements r0.l {
    public final int f49324f0 = 1;
    public final e2.r0 f49325g0;
    public boolean f49326h0;
    public final org.telegram.ui.ActionBar.f2 f49327i0;

    public ra0(org.telegram.ui.Wallet.z5 z5Var, Context context) {
        super(context, null);
        this.f49327i0 = z5Var;
        this.f49325g0 = new Object();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.v5 v5Var = ((org.telegram.ui.Wallet.z5) this.f49327i0).f43462q0;
        if (v5Var != null) {
            v5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.f49327i0;
        bi.t tVar = z5Var.f43459n0;
        if (tVar != null && (tVar.getParent() instanceof View) && ((View) z5Var.f43459n0.getParent()).getTop() <= z5Var.f36518a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public int b0(org.telegram.ui.Components.r41 r41Var, int i7) {
        int[] iArr = {0};
        org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(iArr, 22);
        this.f49326h0 = true;
        r41Var.j(tiVar);
        try {
            r41Var.scrollBy(0, i7);
            ArrayList arrayList = r41Var.f2870w0;
            if (arrayList != null) {
                arrayList.remove(tiVar);
            }
            this.f49326h0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = r41Var.f2870w0;
            if (arrayList2 != null) {
                arrayList2.remove(tiVar);
            }
            this.f49326h0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ra0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f49324f0) {
            case 1:
                return this.f49325g0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void k(int i7, View view) {
        switch (this.f49324f0) {
            case 0:
                this.f49325g0.f10538a = 0;
                return;
            default:
                e2.r0 r0Var = this.f49325g0;
                if (i7 == 1) {
                    r0Var.f10539b = 0;
                } else {
                    r0Var.f10538a = 0;
                }
                org.telegram.ui.Wallet.v5 v5Var = ((org.telegram.ui.Wallet.z5) this.f49327i0).f43462q0;
                if (v5Var != null) {
                    org.telegram.ui.Wallet.l lVar = v5Var.f43262i;
                    fi.w3 w3Var = v5Var.f43258c;
                    if (w3Var != null) {
                        w3Var.removeCallbacks(lVar);
                        v5Var.f43258c.post(lVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ma0 ma0Var;
        org.telegram.ui.Components.r41 y02;
        switch (this.f49324f0) {
            case 0:
                sa0 sa0Var = (sa0) this.f49327i0;
                try {
                    if (view == sa0Var.Q && (ma0Var = sa0Var.L0) != null && ma0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.pj0 currentListView = sa0Var.L0.getCurrentListView();
                        int top = sa0Var.L0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i12;
                            currentListView.scrollBy(0, i12);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.h3(new kz(this, 20));
                    return;
                }
            default:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.f49327i0;
                if (!this.f49326h0 && i12 != 0 && (y02 = z5Var.y0()) != null) {
                    if (view == z5Var.f36518a && Y()) {
                        iArr[1] = b0(y02, i12) + iArr[1];
                        return;
                    } else if (view == y02 && i12 < 0) {
                        iArr[1] = b0(z5Var.f36518a, i12) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
        switch (this.f49324f0) {
            case 0:
                return;
            default:
                l(view, i7, i10, i11, i12, i13, new int[2]);
                return;
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        switch (this.f49324f0) {
            case 0:
                if (((sa0) this.f49327i0).L0 != null && i7 == 2) {
                    return true;
                }
                return false;
            default:
                if ((i7 & 2) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f49324f0) {
            case 0:
                sa0 sa0Var = (sa0) this.f49327i0;
                super.onLayout(z9, i7, i10, i11, i12);
                if (z9) {
                    sa0Var.s0(this.f49326h0);
                    this.f49326h0 = false;
                    return;
                }
                sa0Var.K0(true);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f49324f0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i10) * 0.75f);
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.f49327i0;
                if (z5Var.f43463r != size) {
                    z5Var.f43463r = size;
                    org.telegram.ui.Wallet.n5 n5Var = z5Var.f43448e;
                    if (n5Var != null) {
                        n5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.k5 k5Var = z5Var.f43450f;
                    if (k5Var != null) {
                        k5Var.requestLayout();
                    }
                }
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onNestedPreFling(View view, float f10, float f11) {
        org.telegram.ui.Wallet.v5 v5Var;
        switch (this.f49324f0) {
            case 1:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.f49327i0;
                if (view == z5Var.y0() && (v5Var = z5Var.f43462q0) != null) {
                    return v5Var.a((int) f10, (int) f11);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f10, f11);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f49324f0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        switch (this.f49324f0) {
            case 0:
                this.f49325g0.f10538a = i7;
                return;
            default:
                e2.r0 r0Var = this.f49325g0;
                if (i10 == 1) {
                    r0Var.f10539b = i7;
                    return;
                } else {
                    r0Var.f10538a = i7;
                    return;
                }
        }
    }

    @Override
    public final void s(android.view.View r6, int r7, int r8, int[] r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ra0.s(android.view.View, int, int, int[], int):void");
    }

    public ra0(sa0 sa0Var, Context context) {
        super(context, null);
        this.f49327i0 = sa0Var;
        this.f49326h0 = true;
        this.f49325g0 = new Object();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
