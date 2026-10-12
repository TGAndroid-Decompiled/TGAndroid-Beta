package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xg implements View.OnKeyListener {
    public final int f43934a;
    public final Object f43935b;

    public xg(Object obj, int i10) {
        this.f43934a = i10;
        this.f43935b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f43934a) {
            case 0:
                eo eoVar = (eo) this.f43935b;
                eoVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    eoVar.xa();
                    return true;
                }
                return false;
            case 1:
                pn0 pn0Var = (pn0) this.f43935b;
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
                zv0 zv0Var = (zv0) this.f43935b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = zv0Var.f21738f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
