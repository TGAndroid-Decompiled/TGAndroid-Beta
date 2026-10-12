package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yd0 implements o1.g {
    public final int f42139a;
    public final Object f42140b;

    public yd0(Object obj, int i10) {
        this.f42139a = i10;
        this.f42140b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f42139a;
        int i11 = 0;
        Object obj = this.f42140b;
        switch (i10) {
            case 0:
                pg0 pg0Var = ((bh0) obj).f34546b0;
                if (pg0Var != null) {
                    int i12 = pg0.E;
                    View view = pg0Var.f39217c;
                    ViewGroup viewGroup = pg0Var.f39216b;
                    PointF pointF = pg0Var.f39224y;
                    ih.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.l20 l20Var = pg0Var.h;
                    l20Var.setTranslationX(pointF.x);
                    l20Var.setTranslationY(pointF.y);
                    pg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                yo0 yo0Var = (yo0) obj;
                float f11 = f7 / 100.0f;
                yo0Var.f42200b = f11;
                TextView textView = yo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                yo0Var.invalidate();
                return;
            case 2:
                vu0 vu0Var = (vu0) obj;
                vu0Var.f41074c0 = f7;
                vu0Var.f41076e0 = f10;
                vu0Var.G();
                return;
            case 3:
                rv0 rv0Var = (rv0) obj;
                if (rv0Var.e > rv0Var.f39878f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.j81 j81Var = rv0Var.f39881s.f32333q3;
                int measuredWidth = (int) (((rv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = rv0Var.getMeasuredHeight();
                j81Var.h = measuredWidth;
                j81Var.f26242i = measuredHeight;
                View view2 = j81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                r41 r41Var = (r41) obj;
                r41Var.f39590y = f7 / 1000.0f;
                r41Var.invalidate();
                return;
            default:
                l51 l51Var = (l51) obj;
                org.telegram.ui.Components.j81 j81Var2 = l51Var.f37852r.Q;
                int measuredWidth2 = (int) (((l51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = l51Var.getMeasuredHeight();
                j81Var2.h = measuredWidth2;
                j81Var2.f26242i = measuredHeight2;
                View view3 = j81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
