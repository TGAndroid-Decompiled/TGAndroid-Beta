package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.support.LongSparseIntArray;

public final class y40 extends org.telegram.ui.Components.zk0 {
    public final LongSparseIntArray T2;
    public final s50 U2;

    public y40(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.U2 = s50Var;
        this.T2 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        s50 s50Var = this.U2;
        boolean z10 = s50Var.T.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.T2;
        longSparseIntArray.clear();
        for (int i11 = 0; i11 < s50Var.f42509x2.size(); i11++) {
            longSparseIntArray.put(s50Var.f42509x2.keyAt(i11), 1);
        }
        s50Var.f42509x2.clear();
        int childCount = getChildCount();
        int i12 = 0;
        boolean z11 = false;
        float fMin = Float.MAX_VALUE;
        float fMax = 0.0f;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            f2.o1 o1VarG = G(childAt);
            if (o1VarG == null || (i10 = o1VarG.f5793f) == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
                z11 = z11;
            } else {
                if (i10 == 1) {
                    View view = o1VarG.f5789a;
                    if (view instanceof org.telegram.ui.Cells.b4) {
                        org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) view;
                        i12 = i12;
                        s50Var.f42509x2.append(b4Var.getPeerId(), 1);
                        if (longSparseIntArray.get(b4Var.getPeerId(), 0) == 0) {
                            z11 = true;
                        } else {
                            longSparseIntArray.delete(b4Var.getPeerId());
                        }
                    } else {
                        i12 = i12;
                    }
                    z11 = z11;
                } else {
                    i12 = i12;
                    z11 = z11;
                }
                if (!z10) {
                    fMax = Math.max(fMax, childAt.getY() + childAt.getMeasuredHeight());
                    fMin = Math.min(fMin, Math.max(0.0f, childAt.getY()));
                } else if (!s50Var.T.I.contains(o1VarG)) {
                    fMin = Math.min(fMin, Math.max(0, childAt.getTop()));
                    fMax = Math.max(fMax, childAt.getBottom());
                }
            }
            i12++;
        }
        if (longSparseIntArray.size() > 0 ? true : z11) {
            s50Var.O1();
        }
        if (z10) {
            g50 g50Var = s50Var.T;
            float f11 = g50Var.K;
            float f12 = g50Var.F;
            f10 = (fMin * f12) + ((1.0f - f12) * f11);
            fMax = (fMax * f12) + ((1.0f - f12) * g50Var.J);
        } else {
            f10 = fMin;
        }
        if (fMin != Float.MAX_VALUE) {
            int measuredWidth = (getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1;
            s50Var.f42480r0.set(measuredWidth, f10, getMeasuredWidth() - measuredWidth, Math.min(getMeasuredHeight() - getTranslationY(), fMax));
            canvas.drawRoundRect(s50Var.f42480r0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), s50Var.f42512y0);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
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
        g50 g50Var = this.U2.T;
        HashSet hashSet = g50Var.I;
        s50 s50Var = g50Var.L;
        HashSet hashSet2 = g50Var.H;
        if (g50Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(g50Var.f5739q);
        hashSet.clear();
        hashSet.addAll(g50Var.f5738p);
        g50Var.J = 0.0f;
        g50Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        y40 y40Var = s50Var.M;
        int childCount = y40Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = y40Var.getChildAt(i15);
            f2.o1 o1VarG = y40Var.G(childAt);
            if (o1VarG != null && (i14 = o1VarG.f5793f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(o1VarG)) {
                g50Var.J = Math.max(g50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                g50Var.K = Math.min(g50Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        g50Var.F = 0.0f;
        y40Var.invalidate();
    }

    @Override
    public final void setVisibility(int i10) {
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    s50.N(this.U2, (org.telegram.ui.Components.voip.l) childAt, childAt.isAttachedToWindow() && i10 == 0);
                }
            }
        }
        super.setVisibility(i10);
    }
}
