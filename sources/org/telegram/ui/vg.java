package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vg implements View.OnKeyListener {
    public final int f38567a;
    public final Object f38568b;

    public vg(Object obj, int i10) {
        this.f38567a = i10;
        this.f38568b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38567a) {
            case 0:
                xn xnVar = (xn) this.f38568b;
                xnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    xnVar.ta();
                    return true;
                }
                return false;
            case 1:
                jn0 jn0Var = (jn0) this.f38568b;
                if (i10 == 67) {
                    if (jn0Var.Y[2].length() == 0) {
                        jn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = jn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        jn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    jn0Var.getClass();
                }
                return false;
            default:
                rv0 rv0Var = (rv0) this.f38568b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = rv0Var.f20139f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
