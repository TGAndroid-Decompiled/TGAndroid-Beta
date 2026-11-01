package org.telegram.ui;

import android.graphics.Canvas;
public final class x30 extends org.telegram.ui.ActionBar.l {
    public final org.telegram.ui.Components.ip F1;
    public final a50 G1;

    public x30(a50 a50Var, LaunchActivity launchActivity, org.telegram.ui.Components.ip ipVar) {
        super(launchActivity, null);
        this.G1 = a50Var;
        this.F1 = ipVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.i0.L(1.0f));
            org.telegram.ui.Components.ip ipVar = this.F1;
            ipVar.f27139f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            ipVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.G1.f21587b.invalidate();
        }
    }
}
