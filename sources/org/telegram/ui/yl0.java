package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yl0 implements TextView.OnEditorActionListener {
    public final int f43191a;
    public final pn0 f43192b;

    public yl0(pn0 pn0Var, int i10) {
        this.f43191a = i10;
        this.f43192b = pn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f43191a) {
            case 0:
                pn0 pn0Var = this.f43192b;
                if (i10 == 5) {
                    pn0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    pn0Var.L.callOnClick();
                    return true;
                } else {
                    pn0Var.getClass();
                    return false;
                }
            case 1:
                pn0 pn0Var2 = this.f43192b;
                pn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = pn0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        pn0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    pn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                pn0 pn0Var3 = this.f43192b;
                pn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = pn0Var3.f39576a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        pn0Var3.f39576a0[intValue2].requestFocus();
                        return true;
                    }
                    pn0Var3.f39576a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                pn0 pn0Var4 = this.f43192b;
                pn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                pn0Var4.L.callOnClick();
                return true;
            case 4:
                pn0 pn0Var5 = this.f43192b;
                pn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = pn0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        pn0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    pn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                pn0 pn0Var6 = this.f43192b;
                pn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                pn0Var6.L.callOnClick();
                return true;
            default:
                pn0 pn0Var7 = this.f43192b;
                pn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                pn0Var7.L.callOnClick();
                return true;
        }
    }
}
