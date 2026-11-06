package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class xa extends org.telegram.ui.Components.bo {
    public final int f51805s;
    public final org.telegram.ui.ActionBar.f2 f51806w;

    public xa(int i7, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context);
        this.f51805s = i7;
        this.f51806w = f2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ya yaVar;
        switch (this.f51805s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (yaVar = ((mb) this.f51806w).F0) != null) {
                    yaVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((an) this.f51806w).O7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ya yaVar;
        switch (this.f51805s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (yaVar = ((mb) this.f51806w).F0) != null) {
                    yaVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((an) this.f51806w).O7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
