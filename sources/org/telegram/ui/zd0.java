package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class zd0 extends AnimatedPhoneNumberEditText {
    public final int f53947b2;
    public final be0 f53948c2;

    public zd0(be0 be0Var, Context context, int i7) {
        super(context);
        this.f53947b2 = i7;
        this.f53948c2 = be0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        int i10 = this.f53947b2;
        float f10 = 1.0f;
        be0 be0Var = this.f53948c2;
        switch (i10) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                org.telegram.ui.Components.mb0 mb0Var = be0Var.f45696f;
                if (!z10 && !be0Var.f45689b.isFocused()) {
                    f10 = 0.0f;
                }
                mb0Var.b(f10, f10, true);
                if (z10) {
                    be0Var.f45699h0.f46089c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z10, i7, rect);
                ce0 ce0Var = be0Var.f45699h0;
                org.telegram.ui.Components.mb0 mb0Var2 = be0Var.f45696f;
                if (!z10 && !be0Var.f45687a.isFocused()) {
                    f10 = 0.0f;
                }
                mb0Var2.b(f10, f10, true);
                if (z10) {
                    ce0Var.f46089c.setEditText(this);
                    ce0Var.f46089c.setDispatchBackWhenEmpty(true);
                    if (be0Var.F == 2) {
                        be0.n(be0Var, org.telegram.messenger.hd.M0(2131742859, null));
                        return;
                    }
                    return;
                } else if (be0Var.F == 2) {
                    be0.n(be0Var, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.f53947b2) {
            case 1:
                be0 be0Var = this.f53948c2;
                zd0 zd0Var = be0Var.f45687a;
                if (i7 == 67 && be0Var.f45689b.length() == 0) {
                    zd0Var.requestFocus();
                    zd0Var.setSelection(zd0Var.length());
                    zd0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f53947b2) {
            case 1:
                if (motionEvent.getAction() == 0 && !ce0.b1(this.f53948c2.f45699h0, this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
