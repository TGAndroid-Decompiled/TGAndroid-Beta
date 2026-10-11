package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class rg0 extends AnimatedPhoneNumberEditText {
    public final ug0 G;

    public rg0(ug0 ug0Var, Context context) {
        super(context);
        this.G = ug0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        ug0 ug0Var = this.G;
        vg0 vg0Var = ug0Var.V;
        org.telegram.ui.Components.ae0 ae0Var = ug0Var.f42590f;
        if (!z10 && !ug0Var.f42586a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        ae0Var.b(f7, f7, true);
        if (z10) {
            vg0Var.f43049c.setEditText(this);
            vg0Var.f43049c.setDispatchBackWhenEmpty(true);
            if (ug0Var.f42595x == 2) {
                ug0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (ug0Var.f42595x == 2) {
            ug0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ug0 ug0Var = this.G;
        ak0 ak0Var = ug0Var.f42586a;
        if (i10 == 67 && ug0Var.f42587b.length() == 0) {
            ak0Var.requestFocus();
            ak0Var.setSelection(ak0Var.length());
            ak0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !vg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
