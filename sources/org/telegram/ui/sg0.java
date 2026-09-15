package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class sg0 extends AnimatedPhoneNumberEditText {
    public final vg0 G;

    public sg0(vg0 vg0Var, Context context) {
        super(context);
        this.G = vg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        vg0 vg0Var = this.G;
        wg0 wg0Var = vg0Var.V;
        org.telegram.ui.Components.yc0 yc0Var = vg0Var.f38599f;
        if (!z10 && !vg0Var.f38596a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        yc0Var.b(f7, f7, true);
        if (z10) {
            wg0Var.f39197c.setEditText(this);
            wg0Var.f39197c.setDispatchBackWhenEmpty(true);
            if (vg0Var.f38604x == 2) {
                vg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (vg0Var.f38604x == 2) {
            vg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        vg0 vg0Var = this.G;
        ak0 ak0Var = vg0Var.f38596a;
        if (i10 == 67 && vg0Var.f38597b.length() == 0) {
            ak0Var.requestFocus();
            ak0Var.setSelection(ak0Var.length());
            ak0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !wg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
