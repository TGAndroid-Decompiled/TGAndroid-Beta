package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class z40 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.Components.tp f40334t1;
    public final d60 f40335u1;

    public z40(d60 d60Var, LaunchActivity launchActivity, org.telegram.ui.Components.tp tpVar) {
        super(launchActivity, null);
        this.f40335u1 = d60Var;
        this.f40334t1 = tpVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            org.telegram.ui.Components.tp tpVar = this.f40334t1;
            tpVar.f28589f = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            tpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f40335u1).containerView;
            viewGroup.invalidate();
        }
    }
}
