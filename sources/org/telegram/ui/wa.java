package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class wa extends org.telegram.ui.Components.mo {
    public final int f43912s;
    public final org.telegram.ui.ActionBar.o2 v;

    public wa(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.f43912s = i10;
        this.v = o2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        xa xaVar;
        switch (this.f43912s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (xaVar = ((ob) this.v).F0) != null) {
                    xaVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((tn) this.v).A7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xa xaVar;
        switch (this.f43912s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (xaVar = ((ob) this.v).F0) != null) {
                    xaVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((tn) this.v).A7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
