package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uf implements View.OnKeyListener {
    public final int f52563a;
    public final Object f52564b;

    public uf(Object obj, int i7) {
        this.f52563a = i7;
        this.f52564b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f52563a) {
            case 0:
                bn bnVar = (bn) this.f52564b;
                bnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    bnVar.Va();
                    return true;
                }
                return false;
            case 1:
                hk0 hk0Var = (hk0) this.f52564b;
                if (i7 == 67) {
                    if (hk0Var.Z[2].length() == 0) {
                        hk0Var.Z[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = hk0Var.Z[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        hk0Var.Z[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    hk0Var.getClass();
                }
                return false;
            default:
                mr0 mr0Var = (mr0) this.f52564b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = mr0Var.f30477f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
