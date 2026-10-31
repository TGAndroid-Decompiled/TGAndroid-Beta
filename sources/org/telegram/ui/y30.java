package org.telegram.ui;

import android.graphics.Canvas;
public final class y30 extends org.telegram.ui.ActionBar.l {
    public final org.telegram.ui.Components.ip E1;
    public final b50 F1;

    public y30(b50 b50Var, LaunchActivity launchActivity, org.telegram.ui.Components.ip ipVar) {
        super(launchActivity, null);
        this.F1 = b50Var;
        this.E1 = ipVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.i0.L(1.0f));
            org.telegram.ui.Components.ip ipVar = this.E1;
            ipVar.f27053f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            ipVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.F1.f21586b.invalidate();
        }
    }
}
