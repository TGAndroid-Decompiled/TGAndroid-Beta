package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class va extends org.telegram.ui.Components.ao {
    public final int f50435s;
    public final org.telegram.ui.ActionBar.d2 f50436w;

    public va(int i3, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context);
        this.f50435s = i3;
        this.f50436w = d2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        wa waVar;
        switch (this.f50435s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (waVar = ((kb) this.f50436w).G0) != null) {
                    waVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((wm) this.f50436w).O7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wa waVar;
        switch (this.f50435s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (waVar = ((kb) this.f50436w).G0) != null) {
                    waVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((wm) this.f50436w).O7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
