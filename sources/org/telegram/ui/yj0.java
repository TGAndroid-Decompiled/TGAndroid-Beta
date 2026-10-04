package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class yj0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public yj0(Object obj, Context context, int i10) {
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
                ak0 ak0Var = (ak0) this.H;
                org.telegram.ui.Components.ld0 ld0Var = ak0Var.f34849s;
                if (!z10 && !ak0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                ld0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                ak0 ak0Var2 = (ak0) this.H;
                org.telegram.ui.Components.ld0 ld0Var2 = ak0Var2.f34849s;
                if (!z10 && !ak0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ld0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                tg0 tg0Var = (tg0) this.H;
                org.telegram.ui.Components.ld0 ld0Var3 = tg0Var.f40821f;
                if (!z10 && !tg0Var.f40818b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ld0Var3.b(f11, f11, true);
                if (z10) {
                    tg0Var.V.f41197c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                ak0 ak0Var = (ak0) this.H;
                if (i10 == 67 && ak0Var.Q.length() == 0) {
                    ak0Var.O.requestFocus();
                    yj0 yj0Var = ak0Var.O;
                    yj0Var.setSelection(yj0Var.length());
                    ak0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
