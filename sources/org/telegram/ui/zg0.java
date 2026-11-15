package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class zg0 extends AnimatedPhoneNumberEditText {
    public final int f53969b2;
    public final bh0 f53970c2;

    public zg0(bh0 bh0Var, Context context, int i7) {
        super(context);
        this.f53969b2 = i7;
        this.f53970c2 = bh0Var;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f53969b2) {
            case 1:
                this.M1.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.H6, false));
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        float f10;
        float f11;
        switch (this.f53969b2) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                bh0 bh0Var = this.f53970c2;
                org.telegram.ui.Components.mb0 mb0Var = bh0Var.f45756t1;
                if (!z10 && !bh0Var.K1.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                mb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i7, rect);
                bh0 bh0Var2 = this.f53970c2;
                org.telegram.ui.Components.mb0 mb0Var2 = bh0Var2.f45756t1;
                if (!z10 && !bh0Var2.I1.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                mb0Var2.b(f11, f11, true);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.f53969b2) {
            case 1:
                if (i7 == 67) {
                    bh0 bh0Var = this.f53970c2;
                    if (bh0Var.K1.length() == 0) {
                        bh0Var.I1.requestFocus();
                        zg0 zg0Var = bh0Var.I1;
                        zg0Var.setSelection(zg0Var.length());
                        bh0Var.I1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
