package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ri0 implements TextView.OnEditorActionListener {
    public final int f51729a;
    public final fk0 f51730b;

    public ri0(fk0 fk0Var, int i7) {
        this.f51729a = i7;
        this.f51730b = fk0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f51729a) {
            case 0:
                fk0 fk0Var = this.f51730b;
                if (i7 == 5) {
                    fk0Var.Z[2].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    fk0Var.M.callOnClick();
                    return true;
                } else {
                    fk0Var.getClass();
                    return false;
                }
            case 1:
                fk0 fk0Var2 = this.f51730b;
                fk0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = fk0Var2.Z;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        fk0Var2.Z[intValue].requestFocus();
                        return true;
                    }
                    fk0Var2.Z[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                fk0 fk0Var3 = this.f51730b;
                fk0Var3.getClass();
                if (i7 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = fk0Var3.f47855b0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        fk0Var3.f47855b0[intValue2].requestFocus();
                        return true;
                    }
                    fk0Var3.f47855b0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                fk0 fk0Var4 = this.f51730b;
                fk0Var4.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                fk0Var4.M.callOnClick();
                return true;
            case 4:
                fk0 fk0Var5 = this.f51730b;
                fk0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = fk0Var5.Z;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        fk0Var5.Z[intValue3].requestFocus();
                        return true;
                    }
                    fk0Var5.Z[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 5:
                fk0 fk0Var6 = this.f51730b;
                fk0Var6.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                fk0Var6.M.callOnClick();
                return true;
            default:
                fk0 fk0Var7 = this.f51730b;
                fk0Var7.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                fk0Var7.M.callOnClick();
                return true;
        }
    }
}
