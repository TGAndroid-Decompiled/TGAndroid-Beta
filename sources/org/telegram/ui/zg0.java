package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class zg0 extends AnimatedPhoneNumberEditText {
    public final int V1;
    public final ah0 W1;

    public zg0(ah0 ah0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = ah0Var;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.V1) {
            case 1:
                this.G1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        float f10;
        float f11;
        switch (this.V1) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                ah0 ah0Var = this.W1;
                org.telegram.ui.Components.lb0 lb0Var = ah0Var.f43632p1;
                if (!z9 && !ah0Var.G1.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                lb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z9, i7, rect);
                ah0 ah0Var2 = this.W1;
                org.telegram.ui.Components.lb0 lb0Var2 = ah0Var2.f43632p1;
                if (!z9 && !ah0Var2.E1.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                lb0Var2.b(f11, f11, true);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                if (i7 == 67) {
                    ah0 ah0Var = this.W1;
                    if (ah0Var.G1.length() == 0) {
                        ah0Var.E1.requestFocus();
                        zg0 zg0Var = ah0Var.E1;
                        zg0Var.setSelection(zg0Var.length());
                        ah0Var.E1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
