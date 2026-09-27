package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class wj0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public wj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        float f10;
        float f11;
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                yj0 yj0Var = (yj0) this.H;
                org.telegram.ui.Components.jd0 jd0Var = yj0Var.f40266s;
                if (!z10 && !yj0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                jd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                yj0 yj0Var2 = (yj0) this.H;
                org.telegram.ui.Components.jd0 jd0Var2 = yj0Var2.f40266s;
                if (!z10 && !yj0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                jd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                sg0 sg0Var = (sg0) this.H;
                org.telegram.ui.Components.jd0 jd0Var3 = sg0Var.f37451f;
                if (!z10 && !sg0Var.f37449b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                jd0Var3.b(f11, f11, true);
                if (z10) {
                    sg0Var.V.f37788c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                yj0 yj0Var = (yj0) this.H;
                if (i10 == 67 && yj0Var.Q.length() == 0) {
                    yj0Var.O.requestFocus();
                    wj0 wj0Var = yj0Var.O;
                    wj0Var.setSelection(wj0Var.length());
                    yj0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
