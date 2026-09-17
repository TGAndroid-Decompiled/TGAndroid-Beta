package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xg implements View.OnKeyListener {
    public final int f39612a;
    public final Object f39613b;

    public xg(Object obj, int i10) {
        this.f39612a = i10;
        this.f39613b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f39612a) {
            case 0:
                bo boVar = (bo) this.f39613b;
                boVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    boVar.ta();
                    return true;
                }
                return false;
            case 1:
                qn0 qn0Var = (qn0) this.f39613b;
                if (i10 == 67) {
                    if (qn0Var.Y[2].length() == 0) {
                        qn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = qn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        qn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    qn0Var.getClass();
                }
                return false;
            default:
                zv0 zv0Var = (zv0) this.f39613b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = zv0Var.f19873f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
