package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements o1.g {
    public final int f36910a;
    public final Object f36911b;

    public td0(Object obj, int i10) {
        this.f36910a = i10;
        this.f36911b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f36910a;
        int i11 = 0;
        Object obj = this.f36911b;
        switch (i10) {
            case 0:
                kg0 kg0Var = ((xg0) obj).f38720b0;
                if (kg0Var != null) {
                    int i12 = kg0.E;
                    View view = kg0Var.f34359c;
                    ViewGroup viewGroup = kg0Var.f34358b;
                    PointF pointF = kg0Var.f34366y;
                    gh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.h20 h20Var = kg0Var.h;
                    h20Var.setTranslationX(pointF.x);
                    h20Var.setTranslationY(pointF.y);
                    kg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                so0 so0Var = (so0) obj;
                float f11 = f7 / 100.0f;
                so0Var.f36736b = f11;
                TextView textView = so0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                so0Var.invalidate();
                return;
            case 2:
                ou0 ou0Var = (ou0) obj;
                ou0Var.f35604c0 = f7;
                ou0Var.f35606e0 = f10;
                ou0Var.G();
                return;
            case 3:
                lv0 lv0Var = (lv0) obj;
                if (lv0Var.e > lv0Var.f34789f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.v71 v71Var = lv0Var.f34792s.f30155q3;
                int measuredWidth = (int) (((lv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = lv0Var.getMeasuredHeight();
                v71Var.h = measuredWidth;
                v71Var.f27854i = measuredHeight;
                View view2 = v71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                r41 r41Var = (r41) obj;
                r41Var.f36229y = f7 / 1000.0f;
                r41Var.invalidate();
                return;
            default:
                h51 h51Var = (h51) obj;
                org.telegram.ui.Components.v71 v71Var2 = h51Var.f33283r.Q;
                int measuredWidth2 = (int) (((h51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = h51Var.getMeasuredHeight();
                v71Var2.h = measuredWidth2;
                v71Var2.f27854i = measuredHeight2;
                View view3 = v71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
