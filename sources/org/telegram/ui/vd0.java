package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vd0 implements o1.g {
    public final int f38525a;
    public final Object f38526b;

    public vd0(Object obj, int i10) {
        this.f38525a = i10;
        this.f38526b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f38525a;
        int i11 = 0;
        Object obj = this.f38526b;
        switch (i10) {
            case 0:
                mg0 mg0Var = ((yg0) obj).f39912b0;
                if (mg0Var != null) {
                    int i12 = mg0.E;
                    View view = mg0Var.f35722c;
                    ViewGroup viewGroup = mg0Var.f35721b;
                    PointF pointF = mg0Var.f35729y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.y10 y10Var = mg0Var.h;
                    y10Var.setTranslationX(pointF.x);
                    y10Var.setTranslationY(pointF.y);
                    mg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) obj;
                float f11 = f7 / 100.0f;
                to0Var.f37859b = f11;
                TextView textView = to0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                to0Var.invalidate();
                return;
            case 2:
                ou0 ou0Var = (ou0) obj;
                ou0Var.f36370c0 = f7;
                ou0Var.f36372e0 = f10;
                ou0Var.G();
                return;
            case 3:
                kv0 kv0Var = (kv0) obj;
                if (kv0Var.e > kv0Var.f35250f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.v71 v71Var = kv0Var.f35253s.f31327q3;
                int measuredWidth = (int) (((kv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = kv0Var.getMeasuredHeight();
                v71Var.h = measuredWidth;
                v71Var.f29006i = measuredHeight;
                View view2 = v71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                m41 m41Var = (m41) obj;
                m41Var.f35604y = f7 / 1000.0f;
                m41Var.invalidate();
                return;
            default:
                f51 f51Var = (f51) obj;
                org.telegram.ui.Components.v71 v71Var2 = f51Var.f33501r.Q;
                int measuredWidth2 = (int) (((f51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = f51Var.getMeasuredHeight();
                v71Var2.h = measuredWidth2;
                v71Var2.f29006i = measuredHeight2;
                View view3 = v71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
