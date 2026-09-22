package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class td0 implements o1.g {
    public final int f37639a;
    public final Object f37640b;

    public td0(Object obj, int i10) {
        this.f37639a = i10;
        this.f37640b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f37639a;
        int i11 = 0;
        Object obj = this.f37640b;
        switch (i10) {
            case 0:
                kg0 kg0Var = ((wg0) obj).f39200b0;
                if (kg0Var != null) {
                    int i12 = kg0.E;
                    View view = kg0Var.f35148c;
                    ViewGroup viewGroup = kg0Var.f35147b;
                    PointF pointF = kg0Var.f35155y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.y10 y10Var = kg0Var.h;
                    y10Var.setTranslationX(pointF.x);
                    y10Var.setTranslationY(pointF.y);
                    kg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                so0 so0Var = (so0) obj;
                float f11 = f7 / 100.0f;
                so0Var.f37428b = f11;
                TextView textView = so0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                so0Var.invalidate();
                return;
            case 2:
                ou0 ou0Var = (ou0) obj;
                ou0Var.f36345c0 = f7;
                ou0Var.f36347e0 = f10;
                ou0Var.G();
                return;
            case 3:
                kv0 kv0Var = (kv0) obj;
                if (kv0Var.e > kv0Var.f35267f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.i71 i71Var = kv0Var.f35270s.f31040q3;
                int measuredWidth = (int) (((kv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = kv0Var.getMeasuredHeight();
                i71Var.h = measuredWidth;
                i71Var.f24927i = measuredHeight;
                View view2 = i71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                m41 m41Var = (m41) obj;
                m41Var.f35605y = f7 / 1000.0f;
                m41Var.invalidate();
                return;
            default:
                c51 c51Var = (c51) obj;
                org.telegram.ui.Components.i71 i71Var2 = c51Var.f32676r.Q;
                int measuredWidth2 = (int) (((c51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = c51Var.getMeasuredHeight();
                i71Var2.h = measuredWidth2;
                i71Var2.f24927i = measuredHeight2;
                View view3 = i71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
