package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ud0 extends AnimatedPhoneNumberEditText {
    public final int W1;
    public final wd0 X1;

    public ud0(wd0 wd0Var, Context context, int i3) {
        super(context);
        this.W1 = i3;
        this.X1 = wd0Var;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i3, Rect rect) {
        int i10 = this.W1;
        float f10 = 1.0f;
        wd0 wd0Var = this.X1;
        switch (i10) {
            case 0:
                super.onFocusChanged(z10, i3, rect);
                org.telegram.ui.Components.gb0 gb0Var = wd0Var.f50788f;
                if (!z10 && !wd0Var.f50784b.isFocused()) {
                    f10 = 0.0f;
                }
                gb0Var.b(f10, f10, true);
                if (z10) {
                    wd0Var.f50785b0.f51950c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z10, i3, rect);
                xd0 xd0Var = wd0Var.f50785b0;
                org.telegram.ui.Components.gb0 gb0Var2 = wd0Var.f50788f;
                if (!z10 && !wd0Var.f50782a.isFocused()) {
                    f10 = 0.0f;
                }
                gb0Var2.b(f10, f10, true);
                if (z10) {
                    xd0Var.f51950c.setEditText(this);
                    xd0Var.f51950c.setDispatchBackWhenEmpty(true);
                    if (wd0Var.F == 2) {
                        wd0.n(wd0Var, org.telegram.messenger.bd.M0(2131742869, null));
                        return;
                    }
                    return;
                } else if (wd0Var.F == 2) {
                    wd0.n(wd0Var, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        switch (this.W1) {
            case 1:
                wd0 wd0Var = this.X1;
                ud0 ud0Var = wd0Var.f50782a;
                if (i3 == 67 && wd0Var.f50784b.length() == 0) {
                    ud0Var.requestFocus();
                    ud0Var.setSelection(ud0Var.length());
                    ud0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i3, keyEvent);
            default:
                return super.onKeyDown(i3, keyEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W1) {
            case 1:
                if (motionEvent.getAction() == 0 && !xd0.a1(this.X1.f50785b0, this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
