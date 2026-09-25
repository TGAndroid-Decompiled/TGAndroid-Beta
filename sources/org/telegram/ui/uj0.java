package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class uj0 extends AnimatedPhoneNumberEditText {
    public final int G;
    public final Object H;

    public uj0(Object obj, Context context, int i10) {
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
                wj0 wj0Var = (wj0) this.H;
                org.telegram.ui.Components.jd0 jd0Var = wj0Var.f39387s;
                if (!z10 && !wj0Var.Q.isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                jd0Var.b(f7, f7, true);
                return;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                wj0 wj0Var2 = (wj0) this.H;
                org.telegram.ui.Components.jd0 jd0Var2 = wj0Var2.f39387s;
                if (!z10 && !wj0Var2.O.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                jd0Var2.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                pg0 pg0Var = (pg0) this.H;
                org.telegram.ui.Components.jd0 jd0Var3 = pg0Var.f36524f;
                if (!z10 && !pg0Var.f36522b.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                jd0Var3.b(f11, f11, true);
                if (z10) {
                    pg0Var.V.f36890c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                wj0 wj0Var = (wj0) this.H;
                if (i10 == 67 && wj0Var.Q.length() == 0) {
                    wj0Var.O.requestFocus();
                    uj0 uj0Var = wj0Var.O;
                    uj0Var.setSelection(uj0Var.length());
                    wj0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
