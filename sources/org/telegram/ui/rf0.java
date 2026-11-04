package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class rf0 extends org.telegram.ui.Components.tj0 {
    public final ArrayList f49213f3;
    public final org.telegram.ui.Components.u5 f49214g3;
    public final org.telegram.ui.Components.u5 f49215h3;
    public final k4.j i3;
    public final vf0 f49216j3;

    public rf0(vf0 vf0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f49216j3 = vf0Var;
        this.f49213f3 = new ArrayList(10);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f49214g3 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.f49215h3 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.i3 = new k4.j(24);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rf0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        vf0 vf0Var = this.f49216j3;
        if (vf0Var.f50501w && ((view == (q1Var = vf0Var.Q) && q1Var != null && q1Var.getCurrentPosition() == null) || view == vf0Var.X)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            return true;
        }
        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
        q1Var2.setInvalidatesParent(true);
        q1Var2.S0(canvas);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.L0() && q1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, q1Var2.getPaddingTop());
            q1Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY() + q1Var2.getPaddingTop());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().f25149l & q1Var2.B()) != 0 && (q1Var2.getCurrentPosition().f25149l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().f25705i))) {
            q1Var2.Q0(q1Var2.getAlpha(), canvas, false);
        }
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().f25149l & 8) != 0 && (q1Var2.getCurrentPosition().f25149l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().f25705i))) {
            q1Var2.o1(canvas, q1Var2.getAlpha(), null);
            q1Var2.V0(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() != null) {
            q1Var2.h1(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() == null || q1Var2.getCurrentPosition().h) {
            q1Var2.x1(q1Var2.getAlpha(), canvas, true);
        }
        q1Var2.i1(canvas);
        q1Var2.getTransitionParams().d();
        canvas.restore();
        q1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTop() != 0 && (childAt instanceof uf0)) {
                uf0 uf0Var = (uf0) childAt;
                uf0Var.f50076kd = childAt.getTop();
                uf0Var.f50077ld = childAt.getBottom();
                uf0Var.f50078md = uf0Var.getMessageObject().f1();
            }
        }
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int measuredHeight;
        int l10;
        int i11;
        vf0 vf0Var = this.f49216j3;
        if (vf0Var.N.isEmpty()) {
            f10 = -6.0f;
        } else {
            f10 = 48.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        ViewGroup viewGroup = vf0Var.Z;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((org.telegram.messenger.g0.f22608q.y - (L + measuredHeight)) - org.telegram.messenger.g0.L(8.0f)) - vf0Var.d.f14496b), Integer.MIN_VALUE));
        if (vf0Var.m0) {
            l10 = vf0Var.Y;
        } else {
            l10 = vf0Var.W.l();
        }
        int max = Math.max(org.telegram.messenger.g0.L(12.0f) + l10, -((org.telegram.messenger.g0.L(7.0f) + vf0Var.f50491o0[0]) - getMeasuredWidth()));
        int i12 = vf0Var.O;
        int measuredWidth = getMeasuredWidth() - max;
        if (vf0Var.P.i()) {
            i11 = 0;
        } else {
            i11 = 40;
        }
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - org.telegram.messenger.g0.L(8.0f)) + Math.max(0, i12 - (measuredWidth - org.telegram.messenger.g0.L(i11 + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
