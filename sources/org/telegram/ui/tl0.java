package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tl0 implements TextView.OnEditorActionListener {
    public final int f40933a;
    public final kn0 f40934b;

    public tl0(kn0 kn0Var, int i10) {
        this.f40933a = i10;
        this.f40934b = kn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f40933a) {
            case 0:
                kn0 kn0Var = this.f40934b;
                if (i10 == 5) {
                    kn0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    kn0Var.L.callOnClick();
                    return true;
                } else {
                    kn0Var.getClass();
                    return false;
                }
            case 1:
                kn0 kn0Var2 = this.f40934b;
                kn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = kn0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        kn0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    kn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                kn0 kn0Var3 = this.f40934b;
                kn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = kn0Var3.f38078a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        kn0Var3.f38078a0[intValue2].requestFocus();
                        return true;
                    }
                    kn0Var3.f38078a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                kn0 kn0Var4 = this.f40934b;
                kn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                kn0Var4.L.callOnClick();
                return true;
            case 4:
                kn0 kn0Var5 = this.f40934b;
                kn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = kn0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        kn0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    kn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                kn0 kn0Var6 = this.f40934b;
                kn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                kn0Var6.L.callOnClick();
                return true;
            default:
                kn0 kn0Var7 = this.f40934b;
                kn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                kn0Var7.L.callOnClick();
                return true;
        }
    }
}
