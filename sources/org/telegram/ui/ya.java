package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

public final class ya extends org.telegram.ui.Components.go {

    public final int f44747s;
    public final org.telegram.ui.ActionBar.n2 v;

    public ya(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.f44747s = i10;
        this.v = n2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        za zaVar;
        switch (this.f44747s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (zaVar = ((qb) this.v).F0) != null) {
                    zaVar.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((rn) this.v).A7(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        za zaVar;
        switch (this.f44747s) {
            case 0:
                boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !zDispatchTouchEvent && (zaVar = ((qb) this.v).F0) != null) {
                    zaVar.dismiss();
                }
                return zDispatchTouchEvent;
            default:
                boolean zDispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !zDispatchTouchEvent2) {
                    ((rn) this.v).A7(true);
                }
                return zDispatchTouchEvent2;
        }
    }
}
