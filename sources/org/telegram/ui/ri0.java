package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ri0 implements TextView.OnEditorActionListener {
    public final int f49425a;
    public final ek0 f49426b;

    public ri0(ek0 ek0Var, int i7) {
        this.f49425a = i7;
        this.f49426b = ek0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f49425a) {
            case 0:
                ek0 ek0Var = this.f49426b;
                if (i7 == 5) {
                    ek0Var.Y[2].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    ek0Var.L.callOnClick();
                    return true;
                } else {
                    ek0Var.getClass();
                    return false;
                }
            case 1:
                ek0 ek0Var2 = this.f49426b;
                ek0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = ek0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        ek0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    ek0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                ek0 ek0Var3 = this.f49426b;
                ek0Var3.getClass();
                if (i7 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = ek0Var3.f45316a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        ek0Var3.f45316a0[intValue2].requestFocus();
                        return true;
                    }
                    ek0Var3.f45316a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                ek0 ek0Var4 = this.f49426b;
                ek0Var4.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                ek0Var4.L.callOnClick();
                return true;
            case 4:
                ek0 ek0Var5 = this.f49426b;
                ek0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = ek0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        ek0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    ek0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 5:
                ek0 ek0Var6 = this.f49426b;
                ek0Var6.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                ek0Var6.L.callOnClick();
                return true;
            default:
                ek0 ek0Var7 = this.f49426b;
                ek0Var7.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                ek0Var7.L.callOnClick();
                return true;
        }
    }
}
