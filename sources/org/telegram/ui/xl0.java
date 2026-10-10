package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xl0 implements TextView.OnEditorActionListener {
    public final int f44105a;
    public final nn0 f44106b;

    public xl0(nn0 nn0Var, int i10) {
        this.f44105a = i10;
        this.f44106b = nn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f44105a) {
            case 0:
                nn0 nn0Var = this.f44106b;
                if (i10 == 5) {
                    nn0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    nn0Var.L.callOnClick();
                    return true;
                } else {
                    nn0Var.getClass();
                    return false;
                }
            case 1:
                nn0 nn0Var2 = this.f44106b;
                nn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = nn0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        nn0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    nn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                nn0 nn0Var3 = this.f44106b;
                nn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = nn0Var3.f40285a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        nn0Var3.f40285a0[intValue2].requestFocus();
                        return true;
                    }
                    nn0Var3.f40285a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                nn0 nn0Var4 = this.f44106b;
                nn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                nn0Var4.L.callOnClick();
                return true;
            case 4:
                nn0 nn0Var5 = this.f44106b;
                nn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = nn0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        nn0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    nn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                nn0 nn0Var6 = this.f44106b;
                nn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                nn0Var6.L.callOnClick();
                return true;
            default:
                nn0 nn0Var7 = this.f44106b;
                nn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                nn0Var7.L.callOnClick();
                return true;
        }
    }
}
