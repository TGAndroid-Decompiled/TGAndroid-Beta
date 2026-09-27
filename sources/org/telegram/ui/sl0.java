package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sl0 implements TextView.OnEditorActionListener {
    public final int f37492a;
    public final jn0 f37493b;

    public sl0(jn0 jn0Var, int i10) {
        this.f37492a = i10;
        this.f37493b = jn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f37492a) {
            case 0:
                jn0 jn0Var = this.f37493b;
                if (i10 == 5) {
                    jn0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    jn0Var.L.callOnClick();
                    return true;
                } else {
                    jn0Var.getClass();
                    return false;
                }
            case 1:
                jn0 jn0Var2 = this.f37493b;
                jn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = jn0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        jn0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    jn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                jn0 jn0Var3 = this.f37493b;
                jn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = jn0Var3.f34768a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        jn0Var3.f34768a0[intValue2].requestFocus();
                        return true;
                    }
                    jn0Var3.f34768a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                jn0 jn0Var4 = this.f37493b;
                jn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                jn0Var4.L.callOnClick();
                return true;
            case 4:
                jn0 jn0Var5 = this.f37493b;
                jn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = jn0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        jn0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    jn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                jn0 jn0Var6 = this.f37493b;
                jn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                jn0Var6.L.callOnClick();
                return true;
            default:
                jn0 jn0Var7 = this.f37493b;
                jn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                jn0Var7.L.callOnClick();
                return true;
        }
    }
}
