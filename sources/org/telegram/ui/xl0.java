package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xl0 implements TextView.OnEditorActionListener {
    public final int f38772a;
    public final on0 f38773b;

    public xl0(on0 on0Var, int i10) {
        this.f38772a = i10;
        this.f38773b = on0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38772a) {
            case 0:
                on0 on0Var = this.f38773b;
                if (i10 == 5) {
                    on0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    on0Var.L.callOnClick();
                    return true;
                } else {
                    on0Var.getClass();
                    return false;
                }
            case 1:
                on0 on0Var2 = this.f38773b;
                on0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = on0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        on0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    on0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                on0 on0Var3 = this.f38773b;
                on0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = on0Var3.f35518a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        on0Var3.f35518a0[intValue2].requestFocus();
                        return true;
                    }
                    on0Var3.f35518a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                on0 on0Var4 = this.f38773b;
                on0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                on0Var4.L.callOnClick();
                return true;
            case 4:
                on0 on0Var5 = this.f38773b;
                on0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = on0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        on0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    on0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                on0 on0Var6 = this.f38773b;
                on0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                on0Var6.L.callOnClick();
                return true;
            default:
                on0 on0Var7 = this.f38773b;
                on0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                on0Var7.L.callOnClick();
                return true;
        }
    }
}
