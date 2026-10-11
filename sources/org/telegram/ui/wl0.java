package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wl0 implements TextView.OnEditorActionListener {
    public final int f43859a;
    public final mn0 f43860b;

    public wl0(mn0 mn0Var, int i10) {
        this.f43859a = i10;
        this.f43860b = mn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f43859a) {
            case 0:
                mn0 mn0Var = this.f43860b;
                if (i10 == 5) {
                    mn0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    mn0Var.L.callOnClick();
                    return true;
                } else {
                    mn0Var.getClass();
                    return false;
                }
            case 1:
                mn0 mn0Var2 = this.f43860b;
                mn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = mn0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        mn0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    mn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                mn0 mn0Var3 = this.f43860b;
                mn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = mn0Var3.f40017a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        mn0Var3.f40017a0[intValue2].requestFocus();
                        return true;
                    }
                    mn0Var3.f40017a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                mn0 mn0Var4 = this.f43860b;
                mn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                mn0Var4.L.callOnClick();
                return true;
            case 4:
                mn0 mn0Var5 = this.f43860b;
                mn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = mn0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        mn0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    mn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                mn0 mn0Var6 = this.f43860b;
                mn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                mn0Var6.L.callOnClick();
                return true;
            default:
                mn0 mn0Var7 = this.f43860b;
                mn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                mn0Var7.L.callOnClick();
                return true;
        }
    }
}
