package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements o1.g {
    public final int f40718a;
    public final Object f40719b;

    public td0(Object obj, int i10) {
        this.f40718a = i10;
        this.f40719b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f40718a;
        int i11 = 0;
        Object obj = this.f40719b;
        switch (i10) {
            case 0:
                kg0 kg0Var = ((wg0) obj).f42362b0;
                if (kg0Var != null) {
                    int i12 = kg0.E;
                    View view = kg0Var.f38054c;
                    ViewGroup viewGroup = kg0Var.f38053b;
                    PointF pointF = kg0Var.f38062y;
                    ih.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.y10 y10Var = kg0Var.h;
                    y10Var.setTranslationX(pointF.x);
                    y10Var.setTranslationY(pointF.y);
                    kg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) obj;
                float f11 = f7 / 100.0f;
                to0Var.f40805b = f11;
                TextView textView = to0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                to0Var.invalidate();
                return;
            case 2:
                nu0 nu0Var = (nu0) obj;
                nu0Var.f39023c0 = f7;
                nu0Var.f39025e0 = f10;
                nu0Var.G();
                return;
            case 3:
                jv0 jv0Var = (jv0) obj;
                if (jv0Var.f37849e > jv0Var.f37850f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.i71 i71Var = jv0Var.f37853s.f33655q3;
                int measuredWidth = (int) (((jv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = jv0Var.getMeasuredHeight();
                i71Var.h = measuredWidth;
                i71Var.f26991i = measuredHeight;
                View view2 = i71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                o41 o41Var = (o41) obj;
                o41Var.f39110y = f7 / 1000.0f;
                o41Var.invalidate();
                return;
            default:
                e51 e51Var = (e51) obj;
                org.telegram.ui.Components.i71 i71Var2 = e51Var.f35940r.Q;
                int measuredWidth2 = (int) (((e51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = e51Var.getMeasuredHeight();
                i71Var2.h = measuredWidth2;
                i71Var2.f26991i = measuredHeight2;
                View view3 = i71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
