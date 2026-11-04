package org.telegram.ui;

import android.graphics.Canvas;
public final class u20 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.ap G1;
    public final x30 H1;

    public u20(x30 x30Var, LaunchActivity launchActivity, org.telegram.ui.Components.ap apVar) {
        super(launchActivity, null);
        this.H1 = x30Var;
        this.G1 = apVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            org.telegram.ui.Components.ap apVar = this.G1;
            apVar.f31964f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            apVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.H1.f28586b.invalidate();
        }
    }
}
