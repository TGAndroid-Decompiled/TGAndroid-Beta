package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ug0 extends AnimatedPhoneNumberEditText {
    public final xg0 G;

    public ug0(xg0 xg0Var, Context context) {
        super(context);
        this.G = xg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        xg0 xg0Var = this.G;
        yg0 yg0Var = xg0Var.V;
        org.telegram.ui.Components.yc0 yc0Var = xg0Var.f39617f;
        if (!z10 && !xg0Var.f39614a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        yc0Var.b(f7, f7, true);
        if (z10) {
            yg0Var.f39887c.setEditText(this);
            yg0Var.f39887c.setDispatchBackWhenEmpty(true);
            if (xg0Var.f39622x == 2) {
                xg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (xg0Var.f39622x == 2) {
            xg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        xg0 xg0Var = this.G;
        ck0 ck0Var = xg0Var.f39614a;
        if (i10 == 67 && xg0Var.f39615b.length() == 0) {
            ck0Var.requestFocus();
            ck0Var.setSelection(ck0Var.length());
            ck0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !yg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
