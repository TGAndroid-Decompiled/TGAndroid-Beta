package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uj0 implements TextView.OnEditorActionListener {
    public final int f41962a;
    public final jl0 f41963b;

    public uj0(jl0 jl0Var, int i10) {
        this.f41962a = i10;
        this.f41963b = jl0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f41962a) {
            case 0:
                jl0 jl0Var = this.f41963b;
                if (i10 == 5) {
                    jl0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    jl0Var.L.callOnClick();
                    return true;
                } else {
                    jl0Var.getClass();
                    return false;
                }
            case 1:
                jl0 jl0Var2 = this.f41963b;
                jl0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = jl0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        jl0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    jl0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                jl0 jl0Var3 = this.f41963b;
                jl0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = jl0Var3.f38410a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        jl0Var3.f38410a0[intValue2].requestFocus();
                        return true;
                    }
                    jl0Var3.f38410a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                jl0 jl0Var4 = this.f41963b;
                jl0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                jl0Var4.L.callOnClick();
                return true;
            case 4:
                jl0 jl0Var5 = this.f41963b;
                jl0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = jl0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        jl0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    jl0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    return true;
                }
                return false;
            case 5:
                jl0 jl0Var6 = this.f41963b;
                jl0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                jl0Var6.L.callOnClick();
                return true;
            default:
                jl0 jl0Var7 = this.f41963b;
                jl0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                jl0Var7.L.callOnClick();
                return true;
        }
    }
}
