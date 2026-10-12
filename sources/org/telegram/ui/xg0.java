package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class xg0 extends AnimatedPhoneNumberEditText {
    public final ah0 G;

    public xg0(ah0 ah0Var, Context context) {
        super(context);
        this.G = ah0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        ah0 ah0Var = this.G;
        bh0 bh0Var = ah0Var.V;
        org.telegram.ui.Components.yd0 yd0Var = ah0Var.f34218f;
        if (!z10 && !ah0Var.f34215a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        yd0Var.b(f7, f7, true);
        if (z10) {
            bh0Var.f34547c.setEditText(this);
            bh0Var.f34547c.setDispatchBackWhenEmpty(true);
            if (ah0Var.f34223x == 2) {
                ah0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (ah0Var.f34223x == 2) {
            ah0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ah0 ah0Var = this.G;
        gk0 gk0Var = ah0Var.f34215a;
        if (i10 == 67 && ah0Var.f34216b.length() == 0) {
            gk0Var.requestFocus();
            gk0Var.setSelection(gk0Var.length());
            gk0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !bh0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
