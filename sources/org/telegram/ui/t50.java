package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class t50 extends org.telegram.ui.Components.mm0 {
    public final LongSparseIntArray V2;
    public final n60 W2;

    public t50(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.W2 = n60Var;
        this.V2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t50.dispatchDraw(android.graphics.Canvas):void");
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
        b60 b60Var = this.W2.X;
        HashSet hashSet = b60Var.I;
        n60 n60Var = b60Var.L;
        HashSet hashSet2 = b60Var.H;
        if (b60Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(b60Var.f44903q);
            hashSet.clear();
            hashSet.addAll(b60Var.f44902p);
            b60Var.J = 0.0f;
            b60Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            t50 t50Var = n60Var.Q;
            int childCount = t50Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = t50Var.getChildAt(i15);
                s4.b1 G = t50Var.G(childAt);
                if (G != null && (i14 = G.f44841f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    b60Var.J = Math.max(b60Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    b60Var.K = Math.min(b60Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            b60Var.F = 0.0f;
            t50Var.invalidate();
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
                    n60.O(this.W2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
