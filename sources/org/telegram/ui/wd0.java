package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wd0 implements o1.g {
    public final int f40938a;
    public final Object f40939b;

    public wd0(Object obj, int i10) {
        this.f40938a = i10;
        this.f40939b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f40938a;
        int i11 = 0;
        Object obj = this.f40939b;
        switch (i10) {
            case 0:
                og0 og0Var = ((ah0) obj).f33908b0;
                if (og0Var != null) {
                    int i12 = og0.E;
                    View view = og0Var.f38643c;
                    ViewGroup viewGroup = og0Var.f38642b;
                    PointF pointF = og0Var.f38650y;
                    ih.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.l20 l20Var = og0Var.h;
                    l20Var.setTranslationX(pointF.x);
                    l20Var.setTranslationY(pointF.y);
                    og0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                wo0 wo0Var = (wo0) obj;
                float f11 = f7 / 100.0f;
                wo0Var.f41332b = f11;
                TextView textView = wo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                wo0Var.invalidate();
                return;
            case 2:
                uu0 uu0Var = (uu0) obj;
                uu0Var.f40480c0 = f7;
                uu0Var.f40482e0 = f10;
                uu0Var.G();
                return;
            case 3:
                qv0 qv0Var = (qv0) obj;
                if (qv0Var.e > qv0Var.f39227f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.k81 k81Var = qv0Var.f39230s.f32035q3;
                int measuredWidth = (int) (((qv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = qv0Var.getMeasuredHeight();
                k81Var.h = measuredWidth;
                k81Var.f26263i = measuredHeight;
                View view2 = k81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                r41 r41Var = (r41) obj;
                r41Var.f39283y = f7 / 1000.0f;
                r41Var.invalidate();
                return;
            default:
                l51 l51Var = (l51) obj;
                org.telegram.ui.Components.k81 k81Var2 = l51Var.f37618r.Q;
                int measuredWidth2 = (int) (((l51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = l51Var.getMeasuredHeight();
                k81Var2.h = measuredWidth2;
                k81Var2.f26263i = measuredHeight2;
                View view3 = k81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
