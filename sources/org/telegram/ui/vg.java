package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vg implements View.OnKeyListener {
    public final int f41743a;
    public final Object f41744b;

    public vg(Object obj, int i10) {
        this.f41743a = i10;
        this.f41744b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f41743a) {
            case 0:
                yn ynVar = (yn) this.f41744b;
                ynVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ynVar.sa();
                    return true;
                }
                return false;
            case 1:
                kn0 kn0Var = (kn0) this.f41744b;
                if (i10 == 67) {
                    if (kn0Var.Y[2].length() == 0) {
                        kn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = kn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        kn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    kn0Var.getClass();
                }
                return false;
            default:
                rv0 rv0Var = (rv0) this.f41744b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = rv0Var.f21922f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
