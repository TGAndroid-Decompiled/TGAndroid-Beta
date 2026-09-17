package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yl0 implements TextView.OnEditorActionListener {
    public final int f39932a;
    public final qn0 f39933b;

    public yl0(qn0 qn0Var, int i10) {
        this.f39932a = i10;
        this.f39933b = qn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f39932a) {
            case 0:
                qn0 qn0Var = this.f39933b;
                if (i10 == 5) {
                    qn0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    qn0Var.L.callOnClick();
                    return true;
                } else {
                    qn0Var.getClass();
                    return false;
                }
            case 1:
                qn0 qn0Var2 = this.f39933b;
                qn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = qn0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        qn0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    qn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                qn0 qn0Var3 = this.f39933b;
                qn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = qn0Var3.f36943a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        qn0Var3.f36943a0[intValue2].requestFocus();
                        return true;
                    }
                    qn0Var3.f36943a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                qn0 qn0Var4 = this.f39933b;
                qn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                qn0Var4.L.callOnClick();
                return true;
            case 4:
                qn0 qn0Var5 = this.f39933b;
                qn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = qn0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        qn0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    qn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                qn0 qn0Var6 = this.f39933b;
                qn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                qn0Var6.L.callOnClick();
                return true;
            default:
                qn0 qn0Var7 = this.f39933b;
                qn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                qn0Var7.L.callOnClick();
                return true;
        }
    }
}
