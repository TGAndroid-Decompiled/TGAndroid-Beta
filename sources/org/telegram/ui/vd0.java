package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vd0 implements o1.g {
    public final int f38399a;
    public final Object f38400b;

    public vd0(Object obj, int i10) {
        this.f38399a = i10;
        this.f38400b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f38399a;
        int i11 = 0;
        Object obj = this.f38400b;
        switch (i10) {
            case 0:
                mg0 mg0Var = ((yg0) obj).f39891b0;
                if (mg0Var != null) {
                    int i12 = mg0.E;
                    View view = mg0Var.f35805c;
                    ViewGroup viewGroup = mg0Var.f35804b;
                    PointF pointF = mg0Var.f35812y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.y10 y10Var = mg0Var.h;
                    y10Var.setTranslationX(pointF.x);
                    y10Var.setTranslationY(pointF.y);
                    mg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                uo0 uo0Var = (uo0) obj;
                float f11 = f7 / 100.0f;
                uo0Var.f38107b = f11;
                TextView textView = uo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                uo0Var.invalidate();
                return;
            case 2:
                qu0 qu0Var = (qu0) obj;
                qu0Var.f37028c0 = f7;
                qu0Var.f37030e0 = f10;
                qu0Var.G();
                return;
            case 3:
                mv0 mv0Var = (mv0) obj;
                if (mv0Var.e > mv0Var.f35898f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.j71 j71Var = mv0Var.f35901s.f31060q3;
                int measuredWidth = (int) (((mv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = mv0Var.getMeasuredHeight();
                j71Var.h = measuredWidth;
                j71Var.f25159i = measuredHeight;
                View view2 = j71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                n41 n41Var = (n41) obj;
                n41Var.f35947y = f7 / 1000.0f;
                n41Var.invalidate();
                return;
            default:
                e51 e51Var = (e51) obj;
                org.telegram.ui.Components.j71 j71Var2 = e51Var.f33292r.Q;
                int measuredWidth2 = (int) (((e51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = e51Var.getMeasuredHeight();
                j71Var2.h = measuredWidth2;
                j71Var2.f25159i = measuredHeight2;
                View view3 = j71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
