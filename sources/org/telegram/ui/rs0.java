package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;
public final class rs0 extends ls0 {
    public final int f49568r = 1;
    public final org.telegram.ui.Components.oj0 f49569s;

    public rs0(bi.k5 k5Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f49569s = k5Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.h6 h6Var;
        boolean q10;
        org.telegram.ui.ActionBar.h6 h6Var2;
        switch (this.f49568r) {
            case 0:
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                ImageView imageView = this.f47684c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ss0) this.f49569s).f49955c;
                premiumPreviewFragment.S.reset();
                premiumPreviewFragment.S.postScale(1.0f, premiumPreviewFragment.N / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.S.postTranslate(0.0f, -this.f47686f.f52112e);
                premiumPreviewFragment.R.setLocalMatrix(premiumPreviewFragment.S);
                canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.T);
                h6Var = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).resourceProvider;
                if (h6Var != null) {
                    h6Var2 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).resourceProvider;
                    q10 = h6Var2.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.m6.I.q();
                }
                if (q10) {
                    float L2 = org.telegram.messenger.g0.L(1.0f);
                    premiumPreviewFragment.Q.setStrokeWidth(L2);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.offset(-rectF.left, -rectF.top);
                    float f10 = L2 / 2.0f;
                    rectF.inset(f10, f10);
                    canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.Q);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                RectF rectF2 = org.telegram.messenger.g0.P;
                ImageView imageView2 = this.f47684c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                bi.k5 k5Var = (bi.k5) this.f49569s;
                ((ug.f1) k5Var.d).f56583k2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f47686f.f52112e, ((ug.f1) k5Var.d).Z1);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ((ug.f1) k5Var.d).f56583k2.f56877f);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public rs0(ss0 ss0Var, Context context) {
        super(context, null);
        this.f49569s = ss0Var;
    }
}
