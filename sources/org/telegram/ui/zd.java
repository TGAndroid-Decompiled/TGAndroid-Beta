package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zd extends EditTextBoldCursor {
    public final int G1;

    public zd(Context context, int i10) {
        super(context);
        this.G1 = i10;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 5:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.G1) {
            case 0:
                super.onDetachedFromWindow();
                org.telegram.messenger.i0.v1(this);
                return;
            case 4:
                super.onDetachedFromWindow();
                org.telegram.messenger.i0.v1(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.G1) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 2:
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.i0.J3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 3:
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.i0.J3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 4:
            case 5:
            default:
                return super.onTouchEvent(motionEvent);
            case 6:
                if (!isEnabled()) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
