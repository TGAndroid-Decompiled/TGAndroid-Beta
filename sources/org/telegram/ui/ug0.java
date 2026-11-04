package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ug0 extends AnimatedPhoneNumberEditText {
    public final int W1;
    public final vg0 X1;

    public ug0(vg0 vg0Var, Context context, int i3) {
        super(context);
        this.W1 = i3;
        this.X1 = vg0Var;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.W1) {
            case 1:
                this.H1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onFocusChanged(boolean z10, int i3, Rect rect) {
        float f10;
        float f11;
        switch (this.W1) {
            case 0:
                super.onFocusChanged(z10, i3, rect);
                vg0 vg0Var = this.X1;
                org.telegram.ui.Components.gb0 gb0Var = vg0Var.f50517q1;
                if (!z10 && !vg0Var.H1.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                gb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i3, rect);
                vg0 vg0Var2 = this.X1;
                org.telegram.ui.Components.gb0 gb0Var2 = vg0Var2.f50517q1;
                if (!z10 && !vg0Var2.F1.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                gb0Var2.b(f11, f11, true);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        switch (this.W1) {
            case 1:
                if (i3 == 67) {
                    vg0 vg0Var = this.X1;
                    if (vg0Var.H1.length() == 0) {
                        vg0Var.F1.requestFocus();
                        ug0 ug0Var = vg0Var.F1;
                        ug0Var.setSelection(ug0Var.length());
                        vg0Var.F1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i3, keyEvent);
            default:
                return super.onKeyDown(i3, keyEvent);
        }
    }
}
