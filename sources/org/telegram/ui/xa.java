package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class xa extends org.telegram.ui.Components.ao {
    public final int f51658s;
    public final org.telegram.ui.ActionBar.f2 f51659w;

    public xa(int i7, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context);
        this.f51658s = i7;
        this.f51659w = f2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ya yaVar;
        switch (this.f51658s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (yaVar = ((mb) this.f51659w).F0) != null) {
                    yaVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((cn) this.f51659w).P7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ya yaVar;
        switch (this.f51658s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (yaVar = ((mb) this.f51659w).F0) != null) {
                    yaVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((cn) this.f51659w).P7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
