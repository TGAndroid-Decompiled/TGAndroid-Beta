package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class tg0 extends AnimatedPhoneNumberEditText {
    public final wg0 G;

    public tg0(wg0 wg0Var, Context context) {
        super(context);
        this.G = wg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        wg0 wg0Var = this.G;
        xg0 xg0Var = wg0Var.V;
        org.telegram.ui.Components.hd0 hd0Var = wg0Var.f38182f;
        if (!z10 && !wg0Var.f38179a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        hd0Var.b(f7, f7, true);
        if (z10) {
            xg0Var.f38721c.setEditText(this);
            xg0Var.f38721c.setDispatchBackWhenEmpty(true);
            if (wg0Var.f38187x == 2) {
                wg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (wg0Var.f38187x == 2) {
            wg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        wg0 wg0Var = this.G;
        ck0 ck0Var = wg0Var.f38179a;
        if (i10 == 67 && wg0Var.f38180b.length() == 0) {
            ck0Var.requestFocus();
            ck0Var.setSelection(ck0Var.length());
            ck0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !xg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
