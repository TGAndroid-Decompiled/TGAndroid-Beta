package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ti0 implements TextView.OnEditorActionListener {
    public final int f52335a;
    public final hk0 f52336b;

    public ti0(hk0 hk0Var, int i7) {
        this.f52335a = i7;
        this.f52336b = hk0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f52335a) {
            case 0:
                hk0 hk0Var = this.f52336b;
                if (i7 == 5) {
                    hk0Var.Z[2].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    hk0Var.M.callOnClick();
                    return true;
                } else {
                    hk0Var.getClass();
                    return false;
                }
            case 1:
                hk0 hk0Var2 = this.f52336b;
                hk0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = hk0Var2.Z;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        hk0Var2.Z[intValue].requestFocus();
                        return true;
                    }
                    hk0Var2.Z[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                hk0 hk0Var3 = this.f52336b;
                hk0Var3.getClass();
                if (i7 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = hk0Var3.f48416b0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        hk0Var3.f48416b0[intValue2].requestFocus();
                        return true;
                    }
                    hk0Var3.f48416b0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                hk0 hk0Var4 = this.f52336b;
                hk0Var4.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                hk0Var4.M.callOnClick();
                return true;
            case 4:
                hk0 hk0Var5 = this.f52336b;
                hk0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = hk0Var5.Z;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        hk0Var5.Z[intValue3].requestFocus();
                        return true;
                    }
                    hk0Var5.Z[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 5:
                hk0 hk0Var6 = this.f52336b;
                hk0Var6.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                hk0Var6.M.callOnClick();
                return true;
            default:
                hk0 hk0Var7 = this.f52336b;
                hk0Var7.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                hk0Var7.M.callOnClick();
                return true;
        }
    }
}
