package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vg implements View.OnKeyListener {
    public final int f41561a;
    public final Object f41562b;

    public vg(Object obj, int i10) {
        this.f41561a = i10;
        this.f41562b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f41561a) {
            case 0:
                co coVar = (co) this.f41562b;
                coVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    coVar.ta();
                    return true;
                }
                return false;
            case 1:
                pn0 pn0Var = (pn0) this.f41562b;
                if (i10 == 67) {
                    if (pn0Var.Y[2].length() == 0) {
                        pn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = pn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        pn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    pn0Var.getClass();
                }
                return false;
            default:
                wv0 wv0Var = (wv0) this.f41562b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = wv0Var.f21713f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
