package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class tf1 extends FrameLayout {
    public TextView f37668a;
    public float f37669b;
    public boolean f37670c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f37670c) {
            float f7 = this.f37669b + 0.013333334f;
            this.f37669b = f7;
            if (f7 > 1.0f) {
                this.f37670c = false;
                this.f37669b = 1.0f;
            }
        } else {
            float f10 = this.f37669b - 0.013333334f;
            this.f37669b = f10;
            if (f10 < 0.0f) {
                this.f37670c = true;
                this.f37669b = 0.0f;
            }
        }
        TextView textView = this.f37668a;
        float interpolation = org.telegram.ui.Components.qr.f27423f.getInterpolation(this.f37669b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
