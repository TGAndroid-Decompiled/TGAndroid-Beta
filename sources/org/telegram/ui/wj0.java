package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wj0 implements TextView.OnEditorActionListener {
    public final int f43325a;
    public final ll0 f43326b;

    public wj0(ll0 ll0Var, int i10) {
        this.f43325a = i10;
        this.f43326b = ll0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f43325a) {
            case 0:
                ll0 ll0Var = this.f43326b;
                if (i10 == 5) {
                    ll0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    ll0Var.L.callOnClick();
                    return true;
                } else {
                    ll0Var.getClass();
                    return false;
                }
            case 1:
                ll0 ll0Var2 = this.f43326b;
                ll0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = ll0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        ll0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    ll0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                ll0 ll0Var3 = this.f43326b;
                ll0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = ll0Var3.f39258a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        ll0Var3.f39258a0[intValue2].requestFocus();
                        return true;
                    }
                    ll0Var3.f39258a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                ll0 ll0Var4 = this.f43326b;
                ll0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                ll0Var4.L.callOnClick();
                return true;
            case 4:
                ll0 ll0Var5 = this.f43326b;
                ll0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = ll0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        ll0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    ll0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    return true;
                }
                return false;
            case 5:
                ll0 ll0Var6 = this.f43326b;
                ll0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                ll0Var6.L.callOnClick();
                return true;
            default:
                ll0 ll0Var7 = this.f43326b;
                ll0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                ll0Var7.L.callOnClick();
                return true;
        }
    }
}
