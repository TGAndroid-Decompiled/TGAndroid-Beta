package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class wa extends org.telegram.ui.Components.uo {
    public final int f53040s;
    public final org.telegram.ui.ActionBar.g2 f53041w;

    public wa(int i7, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context);
        this.f53040s = i7;
        this.f53041w = g2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        xa xaVar;
        switch (this.f53040s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (xaVar = ((lb) this.f53041w).G0) != null) {
                    xaVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((bn) this.f53041w).P7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xa xaVar;
        switch (this.f53040s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (xaVar = ((lb) this.f53041w).G0) != null) {
                    xaVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((bn) this.f53041w).P7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
