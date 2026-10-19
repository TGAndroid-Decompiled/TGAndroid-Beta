package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class yf0 extends AnimatedPhoneNumberEditText {
    public final bg0 G;

    public yf0(bg0 bg0Var, Context context) {
        super(context);
        this.G = bg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        bg0 bg0Var = this.G;
        cg0 cg0Var = bg0Var.V;
        org.telegram.ui.Components.sd0 sd0Var = bg0Var.f35643f;
        if (!z10 && !bg0Var.f35640a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        sd0Var.b(f7, f7, true);
        if (z10) {
            cg0Var.f35968c.setEditText(this);
            cg0Var.f35968c.setDispatchBackWhenEmpty(true);
            if (bg0Var.f35648x == 2) {
                bg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (bg0Var.f35648x == 2) {
            bg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        bg0 bg0Var = this.G;
        jj0 jj0Var = bg0Var.f35640a;
        if (i10 == 67 && bg0Var.f35641b.length() == 0) {
            jj0Var.requestFocus();
            jj0Var.setSelection(jj0Var.length());
            jj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !cg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
