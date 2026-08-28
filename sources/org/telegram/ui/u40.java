package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class u40 extends org.telegram.ui.Components.wk0 {
    public final LongSparseIntArray T2;
    public final o50 U2;

    public u40(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.U2 = o50Var;
        this.T2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.U2.T2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        c50 c50Var = this.U2.T;
        HashSet hashSet = c50Var.I;
        o50 o50Var = c50Var.L;
        HashSet hashSet2 = c50Var.H;
        if (c50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(c50Var.f5451q);
            hashSet.clear();
            hashSet.addAll(c50Var.f5450p);
            c50Var.J = 0.0f;
            c50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            u40 u40Var = o50Var.M;
            int childCount = u40Var.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = u40Var.getChildAt(i14);
                f2.q1 G = u40Var.G(childAt);
                if (G != null && (i13 = G.f5505f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
                    c50Var.J = Math.max(c50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    c50Var.K = Math.min(c50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            c50Var.F = 0.0f;
            u40Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i9) {
        boolean z10;
        if (getVisibility() != i9) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (childAt.isAttachedToWindow() && i9 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o50.M(this.U2, lVar, z10);
                }
            }
        }
        super.setVisibility(i9);
    }
}
