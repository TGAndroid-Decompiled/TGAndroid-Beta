package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class zc0 extends org.telegram.ui.Components.qv0 implements r0.n {
    public final c5.e f43902t0;
    public boolean f43903u0;
    public final bd0 f43904v0;

    public zc0(bd0 bd0Var, Context context) {
        super(context, null);
        this.f43904v0 = bd0Var;
        this.f43903u0 = true;
        this.f43902t0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        rc0 rc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.tl0 currentListView;
        int max;
        bd0 bd0Var = this.f43904v0;
        if (viewGroup == bd0Var.R && (rc0Var = bd0Var.H0) != null && rc0Var.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.p2) bd0Var).actionBar;
            boolean z4 = kVar.f21546k0;
            int top = bd0Var.H0.getTop();
            boolean z10 = false;
            if (i11 < 0) {
                if (top <= 0 && (currentListView = bd0Var.H0.getCurrentListView()) != null) {
                    int L0 = ((f2.j0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        f2.m1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f5875a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i14 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i11;
                            } else {
                                max = Math.max(i11, i14 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i11);
                            z10 = true;
                        }
                    }
                }
                if (z4) {
                    if (!z10 && top < 0) {
                        iArr[1] = i11 - Math.max(top, i11);
                    } else {
                        iArr[1] = i11;
                    }
                }
            } else if (z4) {
                org.telegram.ui.Components.tl0 currentListView2 = bd0Var.H0.getCurrentListView();
                iArr[1] = i11;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i13);
                }
            }
        }
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        bd0 bd0Var = this.f43904v0;
        if (bd0Var.H0 != null) {
            canvas.save();
            canvas.translate(0.0f, bd0Var.R.getY());
            bd0Var.H0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        boolean drawChild = super.drawChild(canvas, view, j10);
        bd0 bd0Var = this.f43904v0;
        kVar = ((org.telegram.ui.ActionBar.p2) bd0Var).actionBar;
        if (view == kVar) {
            f5Var = ((org.telegram.ui.ActionBar.p2) bd0Var).parentLayout;
            if (f5Var != null) {
                f5Var2 = ((org.telegram.ui.ActionBar.p2) bd0Var).parentLayout;
                kVar2 = ((org.telegram.ui.ActionBar.p2) bd0Var).actionBar;
                ((ActionBarLayout) f5Var2).q(canvas, kVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        rc0 rc0Var;
        bd0 bd0Var = this.f43904v0;
        try {
            if (viewGroup == bd0Var.R && (rc0Var = bd0Var.H0) != null && rc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.tl0 currentListView = bd0Var.H0.getCurrentListView();
                int top = bd0Var.H0.getTop();
                if (currentListView != null && top == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new c10(this, 17));
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f43902t0.f2268a = 0;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        bd0 bd0Var = this.f43904v0;
        if (z4) {
            bd0Var.k0(this.f43903u0);
            this.f43903u0 = false;
            return;
        }
        bd0Var.A0(true);
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f43904v0.H0 != null && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f43902t0.f2268a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
