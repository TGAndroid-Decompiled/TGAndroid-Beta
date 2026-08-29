package ph;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
public final class g2 extends m3 {
    public final int V;
    public final Object W;

    public g2(Object obj, Context context, int i10) {
        super(context);
        this.V = i10;
        this.W = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: ph.g2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.V) {
            case 0:
                if (!((p2) this.W).B) {
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
    public void setTranslationY(float f9) {
        switch (this.V) {
            case 0:
                super.setTranslationY(f9);
                p2 p2Var = (p2) this.W;
                BotFullscreenButtons botFullscreenButtons = p2Var.f45969i0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f9);
                }
                FrameLayout frameLayout = p2Var.f45972l0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f);
                    int i10 = p2Var.h.top;
                    frameLayout.setTranslationY(p2Var.v.getTranslationY() + AndroidUtilities.lerp(currentActionBarHeight, AndroidUtilities.dp(70.0f) + i10, p2Var.f45959b0));
                    return;
                }
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }
}
