package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yc0 implements o1.g {
    public final int f43436a;
    public final Object f43437b;

    public yc0(Object obj, int i10) {
        this.f43436a = i10;
        this.f43437b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f43436a;
        int i11 = 0;
        Object obj = this.f43437b;
        switch (i10) {
            case 0:
                qf0 qf0Var = ((cg0) obj).f35967b0;
                if (qf0Var != null) {
                    int i12 = qf0.E;
                    View view = qf0Var.f40562c;
                    ViewGroup viewGroup = qf0Var.f40561b;
                    PointF pointF = qf0Var.f40569y;
                    ih.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.h20 h20Var = qf0Var.h;
                    h20Var.setTranslationX(pointF.x);
                    h20Var.setTranslationY(pointF.y);
                    qf0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                ao0 ao0Var = (ao0) obj;
                float f11 = f7 / 100.0f;
                ao0Var.f35408b = f11;
                TextView textView = ao0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                ao0Var.invalidate();
                return;
            case 2:
                ut0 ut0Var = (ut0) obj;
                ut0Var.f42037c0 = f7;
                ut0Var.f42039e0 = f10;
                ut0Var.G();
                return;
            case 3:
                qu0 qu0Var = (qu0) obj;
                if (qu0Var.e > qu0Var.f40975f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.d81 d81Var = qu0Var.f40978s.f33379q3;
                int measuredWidth = (int) (((qu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = qu0Var.getMeasuredHeight();
                d81Var.h = measuredWidth;
                d81Var.f25470i = measuredHeight;
                View view2 = d81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                x21 x21Var = (x21) obj;
                x21Var.f43003y = f7 / 1000.0f;
                x21Var.invalidate();
                return;
            default:
                r31 r31Var = (r31) obj;
                org.telegram.ui.Components.d81 d81Var2 = r31Var.f41056r.Q;
                int measuredWidth2 = (int) (((r31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = r31Var.getMeasuredHeight();
                d81Var2.h = measuredWidth2;
                d81Var2.f25470i = measuredHeight2;
                View view3 = d81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
