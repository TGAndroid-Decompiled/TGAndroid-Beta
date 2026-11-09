package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wf implements View.OnKeyListener {
    public final int f51401a;
    public final Object f51402b;

    public wf(Object obj, int i7) {
        this.f51401a = i7;
        this.f51402b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f51401a) {
            case 0:
                cn cnVar = (cn) this.f51402b;
                cnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    cnVar.Ua();
                    return true;
                }
                return false;
            case 1:
                dk0 dk0Var = (dk0) this.f51402b;
                if (i7 == 67) {
                    if (dk0Var.Y[2].length() == 0) {
                        dk0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = dk0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        dk0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    dk0Var.getClass();
                }
                return false;
            default:
                or0 or0Var = (or0) this.f51402b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = or0Var.f28896f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
