package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tg implements View.OnKeyListener {
    public final int f37640a;
    public final Object f37641b;

    public tg(Object obj, int i10) {
        this.f37640a = i10;
        this.f37641b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f37640a) {
            case 0:
                xn xnVar = (xn) this.f37641b;
                xnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    xnVar.ta();
                    return true;
                }
                return false;
            case 1:
                in0 in0Var = (in0) this.f37641b;
                if (i10 == 67) {
                    if (in0Var.Y[2].length() == 0) {
                        in0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = in0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        in0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    in0Var.getClass();
                }
                return false;
            default:
                qv0 qv0Var = (qv0) this.f37641b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = qv0Var.f19864f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
