package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class w40 extends org.telegram.ui.Components.jm0 {
    public final LongSparseIntArray V2;
    public final q50 W2;

    public w40(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.W2 = q50Var;
        this.V2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.W2.X2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        e50 e50Var = this.W2.X;
        HashSet hashSet = e50Var.I;
        q50 q50Var = e50Var.L;
        HashSet hashSet2 = e50Var.H;
        if (e50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(e50Var.f45982q);
            hashSet.clear();
            hashSet.addAll(e50Var.f45981p);
            e50Var.J = 0.0f;
            e50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            w40 w40Var = q50Var.Q;
            int childCount = w40Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = w40Var.getChildAt(i15);
                s4.b1 G = w40Var.G(childAt);
                if (G != null && (i14 = G.f45920f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    e50Var.J = Math.max(e50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    e50Var.K = Math.min(e50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            e50Var.F = 0.0f;
            w40Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (childAt.isAttachedToWindow() && i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q50.O(this.W2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
