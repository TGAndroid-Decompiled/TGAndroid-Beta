package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
public final class x40 extends org.telegram.ui.Components.jl0 {
    public final LongSparseIntArray T2;
    public final r50 U2;

    public x40(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.U2 = r50Var;
        this.T2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.U2.T2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        f50 f50Var = this.U2.T;
        HashSet hashSet = f50Var.I;
        r50 r50Var = f50Var.L;
        HashSet hashSet2 = f50Var.H;
        if (f50Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(f50Var.f6406q);
            hashSet.clear();
            hashSet.addAll(f50Var.f6405p);
            f50Var.J = 0.0f;
            f50Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            x40 x40Var = r50Var.M;
            int childCount = x40Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = x40Var.getChildAt(i15);
                f2.n1 G = x40Var.G(childAt);
                if (G != null && (i14 = G.f6436f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                    f50Var.J = Math.max(f50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    f50Var.K = Math.min(f50Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            f50Var.F = 0.0f;
            x40Var.invalidate();
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
                    r50.M(this.U2, lVar, z10);
                }
            }
        }
        super.setVisibility(i10);
    }
}
