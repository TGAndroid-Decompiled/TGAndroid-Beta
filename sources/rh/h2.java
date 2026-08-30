package rh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
public final class h2 extends n3 {
    public final int W;
    public final Object f43551a0;

    public h2(Object obj, Context context, int i10) {
        super(context);
        this.W = i10;
        this.f43551a0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: rh.h2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.W) {
            case 0:
                if (!((q2) this.f43551a0).C) {
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
                q2 q2Var = (q2) this.f43551a0;
                BotFullscreenButtons botFullscreenButtons = q2Var.f43691j0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f10);
                }
                FrameLayout frameLayout = q2Var.m0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f);
                    int i10 = q2Var.h.top;
                    frameLayout.setTranslationY(q2Var.v.getTranslationY() + AndroidUtilities.lerp(currentActionBarHeight, AndroidUtilities.dp(70.0f) + i10, q2Var.f43683c0));
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
