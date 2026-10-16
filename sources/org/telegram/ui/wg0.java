package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class wg0 extends AnimatedPhoneNumberEditText {
    public final zg0 G;

    public wg0(zg0 zg0Var, Context context) {
        super(context);
        this.G = zg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        zg0 zg0Var = this.G;
        ah0 ah0Var = zg0Var.V;
        org.telegram.ui.Components.yd0 yd0Var = zg0Var.f42312f;
        if (!z10 && !zg0Var.f42309a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        yd0Var.b(f7, f7, true);
        if (z10) {
            ah0Var.f33909c.setEditText(this);
            ah0Var.f33909c.setDispatchBackWhenEmpty(true);
            if (zg0Var.f42317x == 2) {
                zg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (zg0Var.f42317x == 2) {
            zg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        zg0 zg0Var = this.G;
        fk0 fk0Var = zg0Var.f42309a;
        if (i10 == 67 && zg0Var.f42310b.length() == 0) {
            fk0Var.requestFocus();
            fk0Var.setSelection(fk0Var.length());
            fk0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ah0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
