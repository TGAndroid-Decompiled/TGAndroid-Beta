package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class rc0 extends org.telegram.ui.Components.zu0 implements r0.n {

    public final d5.p f41899s0;

    public boolean f41900t0;

    public final tc0 f41901u0;

    public rc0(tc0 tc0Var, Context context) {
        super(context, null);
        this.f41901u0 = tc0Var;
        this.f41900t0 = true;
        this.f41899s0 = new d5.p();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        jc0 jc0Var;
        int i13;
        org.telegram.ui.Components.zk0 currentListView;
        tc0 tc0Var = this.f41901u0;
        if (viewGroup == tc0Var.Q && (jc0Var = tc0Var.G0) != null && jc0Var.isAttachedToWindow()) {
            boolean z10 = ((org.telegram.ui.ActionBar.n2) tc0Var).actionBar.f23578j0;
            int top = tc0Var.G0.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.zk0 currentListView2 = tc0Var.G0.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i13 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i13);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = tc0Var.G0.getCurrentListView()) != null) {
                int iL0 = ((f2.k0) currentListView.getLayoutManager()).L0();
                if (iL0 != -1) {
                    f2.o1 o1VarK = currentListView.K(iL0);
                    int top2 = o1VarK != null ? o1VarK.f5789a.getTop() : -1;
                    int paddingTop = currentListView.getPaddingTop();
                    if (top2 != paddingTop || iL0 != 0) {
                        iArr[1] = iL0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                        currentListView.scrollBy(0, i11);
                        z11 = true;
                    }
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        tc0 tc0Var = this.f41901u0;
        if (tc0Var.G0 != null) {
            canvas.save();
            canvas.translate(0.0f, tc0Var.Q.getY());
            tc0Var.G0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        tc0 tc0Var = this.f41901u0;
        if (view == ((org.telegram.ui.ActionBar.n2) tc0Var).actionBar && ((org.telegram.ui.ActionBar.n2) tc0Var).parentLayout != null) {
            ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) tc0Var).parentLayout).q(canvas, ((org.telegram.ui.ActionBar.n2) tc0Var).actionBar.getMeasuredHeight());
        }
        return zDrawChild;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        jc0 jc0Var;
        tc0 tc0Var = this.f41901u0;
        try {
            if (viewGroup == tc0Var.Q && (jc0Var = tc0Var.G0) != null && jc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.zk0 currentListView = tc0Var.G0.getCurrentListView();
                int top = tc0Var.G0.getTop();
                if (currentListView == null || top != 0) {
                    return;
                }
                iArr[1] = i13;
                currentListView.scrollBy(0, i13);
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new r00(this, 17));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        tc0 tc0Var = this.f41901u0;
        if (!z10) {
            tc0Var.A0(true);
        } else {
            tc0Var.k0(this.f41900t0);
            this.f41900t0 = false;
        }
    }

    @Override
    public final void p(int i10, View view) {
        this.f41899s0.f4821a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i10, int i11) {
        return this.f41901u0.G0 != null && i10 == 2;
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.f41899s0.f4821a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
