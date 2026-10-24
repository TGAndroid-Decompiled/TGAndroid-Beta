package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class z40 extends org.telegram.ui.Components.lm0 {
    public final LongSparseIntArray Y2;
    public final u50 Z2;

    public z40(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Z2 = u50Var;
        this.Y2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.Z2.X2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        i50 i50Var = this.Z2.X;
        HashSet hashSet = i50Var.I;
        u50 u50Var = i50Var.L;
        HashSet hashSet2 = i50Var.H;
        if (i50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(i50Var.f46407q);
            hashSet.clear();
            hashSet.addAll(i50Var.f46406p);
            i50Var.J = 0.0f;
            i50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            z40 z40Var = u50Var.Q;
            int childCount = z40Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = z40Var.getChildAt(i15);
                s4.b1 G = z40Var.G(childAt);
                if (G != null && (i14 = G.f46345f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    i50Var.J = Math.max(i50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    i50Var.K = Math.min(i50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            i50Var.F = 0.0f;
            z40Var.invalidate();
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
                    u50.N(this.Z2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
