package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class zf0 extends AnimatedPhoneNumberEditText {
    public final cg0 G;

    public zf0(cg0 cg0Var, Context context) {
        super(context);
        this.G = cg0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        super.onFocusChanged(z10, i10, rect);
        cg0 cg0Var = this.G;
        dg0 dg0Var = cg0Var.V;
        org.telegram.ui.Components.sd0 sd0Var = cg0Var.f35966f;
        if (!z10 && !cg0Var.f35963a.isFocused()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        sd0Var.b(f7, f7, true);
        if (z10) {
            dg0Var.f36371c.setEditText(this);
            dg0Var.f36371c.setDispatchBackWhenEmpty(true);
            if (cg0Var.f35971x == 2) {
                cg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        } else if (cg0Var.f35971x == 2) {
            cg0Var.setCountryButtonText(null);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        cg0 cg0Var = this.G;
        kj0 kj0Var = cg0Var.f35963a;
        if (i10 == 67 && cg0Var.f35964b.length() == 0) {
            kj0Var.requestFocus();
            kj0Var.setSelection(kj0Var.length());
            kj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !dg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
