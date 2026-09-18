package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ud0 implements o1.g {
    public final int f37972a;
    public final Object f37973b;

    public ud0(Object obj, int i10) {
        this.f37972a = i10;
        this.f37973b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f37972a;
        int i11 = 0;
        Object obj = this.f37973b;
        switch (i10) {
            case 0:
                lg0 lg0Var = ((xg0) obj).f39464b0;
                if (lg0Var != null) {
                    int i12 = lg0.E;
                    View view = lg0Var.f35371c;
                    ViewGroup viewGroup = lg0Var.f35370b;
                    PointF pointF = lg0Var.f35378y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.y10 y10Var = lg0Var.h;
                    y10Var.setTranslationX(pointF.x);
                    y10Var.setTranslationY(pointF.y);
                    lg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) obj;
                float f11 = f7 / 100.0f;
                to0Var.f37785b = f11;
                TextView textView = to0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                to0Var.invalidate();
                return;
            case 2:
                ou0 ou0Var = (ou0) obj;
                ou0Var.f36242c0 = f7;
                ou0Var.f36244e0 = f10;
                ou0Var.G();
                return;
            case 3:
                kv0 kv0Var = (kv0) obj;
                if (kv0Var.e > kv0Var.f35187f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.w71 w71Var = kv0Var.f35190s.f31287q3;
                int measuredWidth = (int) (((kv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = kv0Var.getMeasuredHeight();
                w71Var.h = measuredWidth;
                w71Var.f29936i = measuredHeight;
                View view2 = w71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                l41 l41Var = (l41) obj;
                l41Var.f35250y = f7 / 1000.0f;
                l41Var.invalidate();
                return;
            default:
                c51 c51Var = (c51) obj;
                org.telegram.ui.Components.w71 w71Var2 = c51Var.f32548r.Q;
                int measuredWidth2 = (int) (((c51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = c51Var.getMeasuredHeight();
                w71Var2.h = measuredWidth2;
                w71Var2.f29936i = measuredHeight2;
                View view3 = w71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
