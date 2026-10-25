package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;
public final class ya0 extends EditText {
    public final int f46013a;

    public ya0(Context context, int i10) {
        super(context);
        this.f46013a = i10;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f46013a) {
            case 0:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
