package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class zd0 extends AnimatedPhoneNumberEditText {
    public final int V1;
    public final be0 W1;

    public zd0(be0 be0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = be0Var;
    }

    @Override
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        int i10 = this.V1;
        float f10 = 1.0f;
        be0 be0Var = this.W1;
        switch (i10) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                org.telegram.ui.Components.lb0 lb0Var = be0Var.f44302f;
                if (!z9 && !be0Var.f44295b.isFocused()) {
                    f10 = 0.0f;
                }
                lb0Var.b(f10, f10, true);
                if (z9) {
                    be0Var.f44304g0.f44765c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z9, i7, rect);
                ce0 ce0Var = be0Var.f44304g0;
                org.telegram.ui.Components.lb0 lb0Var2 = be0Var.f44302f;
                if (!z9 && !be0Var.f44293a.isFocused()) {
                    f10 = 0.0f;
                }
                lb0Var2.b(f10, f10, true);
                if (z9) {
                    ce0Var.f44765c.setEditText(this);
                    ce0Var.f44765c.setDispatchBackWhenEmpty(true);
                    if (be0Var.E == 2) {
                        be0.n(be0Var, org.telegram.messenger.id.M0(2131742862, null));
                        return;
                    }
                    return;
                } else if (be0Var.E == 2) {
                    be0.n(be0Var, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                be0 be0Var = this.W1;
                zd0 zd0Var = be0Var.f44293a;
                if (i7 == 67 && be0Var.f44295b.length() == 0) {
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
        switch (this.V1) {
            case 1:
                if (motionEvent.getAction() == 0 && !ce0.b1(this.W1.f44304g0, this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
