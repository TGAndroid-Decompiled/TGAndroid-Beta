package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class zf0 extends org.telegram.ui.Components.ek0 {
    public final ArrayList f54607f3;
    public final org.telegram.ui.Components.c6 f54608g3;
    public final org.telegram.ui.Components.c6 f54609h3;
    public final org.telegram.ui.Components.i61 f54610i3;
    public final dg0 j3;

    public zf0(dg0 dg0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.j3 = dg0Var;
        this.f54607f3 = new ArrayList(10);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.f54608g3 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.f54609h3 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.f54610i3 = new org.telegram.ui.Components.i61(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zf0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.r1 r1Var;
        dg0 dg0Var = this.j3;
        if (dg0Var.f47120w && ((view == (r1Var = dg0Var.Q) && r1Var != null && r1Var.getCurrentPosition() == null) || view == dg0Var.X)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.r1)) {
            return true;
        }
        org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) view;
        r1Var2.setInvalidatesParent(true);
        r1Var2.S0(canvas);
        canvas.save();
        canvas.translate(r1Var2.getX(), r1Var2.getY());
        canvas.scale(r1Var2.getScaleX(), r1Var2.getScaleY(), r1Var2.getPivotX(), r1Var2.getPivotY());
        if (r1Var2.L0() && r1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, r1Var2.getPaddingTop());
            r1Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        canvas.translate(r1Var2.getX(), r1Var2.getY() + r1Var2.getPaddingTop());
        canvas.scale(r1Var2.getScaleX(), r1Var2.getScaleY(), r1Var2.getPivotX(), r1Var2.getPivotY());
        if (r1Var2.getCurrentPosition() != null && (((r1Var2.getCurrentPosition().f28005l & r1Var2.E()) != 0 && (r1Var2.getCurrentPosition().f28005l & 1) != 0) || (r1Var2.getCurrentMessagesGroup() != null && r1Var2.getCurrentMessagesGroup().f23012i))) {
            r1Var2.Q0(r1Var2.getAlpha(), canvas, false);
        }
        if (r1Var2.getCurrentPosition() != null && (((r1Var2.getCurrentPosition().f28005l & 8) != 0 && (r1Var2.getCurrentPosition().f28005l & 1) != 0) || (r1Var2.getCurrentMessagesGroup() != null && r1Var2.getCurrentMessagesGroup().f23012i))) {
            r1Var2.o1(canvas, r1Var2.getAlpha(), null);
            r1Var2.V0(canvas, r1Var2.getAlpha());
        }
        if (r1Var2.getCurrentPosition() != null) {
            r1Var2.h1(canvas, r1Var2.getAlpha());
        }
        if (r1Var2.getCurrentPosition() == null || r1Var2.getCurrentPosition().h) {
            r1Var2.y1(r1Var2.getAlpha(), canvas, true);
        }
        r1Var2.i1(canvas);
        r1Var2.getTransitionParams().d();
        canvas.restore();
        r1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTop() != 0 && (childAt instanceof cg0)) {
                cg0 cg0Var = (cg0) childAt;
                cg0Var.f46794zd = childAt.getTop();
                cg0Var.Ad = childAt.getBottom();
                cg0Var.Bd = cg0Var.getMessageObject().e1();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int measuredHeight;
        int l10;
        int i11;
        dg0 dg0Var = this.j3;
        if (dg0Var.N.isEmpty()) {
            f10 = -6.0f;
        } else {
            f10 = 48.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        ViewGroup viewGroup = dg0Var.Z;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((org.telegram.messenger.g0.f24226q.y - (L + measuredHeight)) - org.telegram.messenger.g0.L(8.0f)) - dg0Var.d.f15979b), Integer.MIN_VALUE));
        if (dg0Var.f47111p0) {
            l10 = dg0Var.Y;
        } else {
            l10 = dg0Var.W.l();
        }
        int max = Math.max(org.telegram.messenger.g0.L(12.0f) + l10, -((org.telegram.messenger.g0.L(7.0f) + dg0Var.f47114r0[0]) - getMeasuredWidth()));
        int i12 = dg0Var.O;
        int measuredWidth = getMeasuredWidth() - max;
        if (dg0Var.P.i()) {
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
