package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vg implements View.OnKeyListener {
    public final int f38529a;
    public final Object f38530b;

    public vg(Object obj, int i10) {
        this.f38529a = i10;
        this.f38530b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38529a) {
            case 0:
                bo boVar = (bo) this.f38530b;
                boVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    boVar.ta();
                    return true;
                }
                return false;
            case 1:
                on0 on0Var = (on0) this.f38530b;
                if (i10 == 67) {
                    if (on0Var.Y[2].length() == 0) {
                        on0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = on0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        on0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    on0Var.getClass();
                }
                return false;
            default:
                xv0 xv0Var = (xv0) this.f38530b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = xv0Var.f19901f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
