package org.telegram.ui;

import android.graphics.Canvas;
public final class z20 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.ap F1;
    public final c40 G1;

    public z20(c40 c40Var, LaunchActivity launchActivity, org.telegram.ui.Components.ap apVar) {
        super(launchActivity, null);
        this.G1 = c40Var;
        this.F1 = apVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            org.telegram.ui.Components.ap apVar = this.F1;
            apVar.f31872f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            apVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.G1.f28616b.invalidate();
        }
    }
}
