package rh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
public final class g2 extends m3 {
    public final int W;
    public final Object f43603a0;

    public g2(Object obj, Context context, int i10) {
        super(context);
        this.W = i10;
        this.f43603a0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: rh.g2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.W) {
            case 0:
                if (!((p2) this.f43603a0).C) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.W) {
            case 0:
                super.setTranslationY(f10);
                p2 p2Var = (p2) this.f43603a0;
                BotFullscreenButtons botFullscreenButtons = p2Var.f43743j0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f10);
                }
                FrameLayout frameLayout = p2Var.m0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f);
                    int i10 = p2Var.h.top;
                    frameLayout.setTranslationY(p2Var.v.getTranslationY() + AndroidUtilities.lerp(currentActionBarHeight, AndroidUtilities.dp(70.0f) + i10, p2Var.f43735c0));
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
