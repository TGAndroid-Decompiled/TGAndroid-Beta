package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vg implements View.OnKeyListener {
    public final int f38565a;
    public final Object f38566b;

    public vg(Object obj, int i10) {
        this.f38565a = i10;
        this.f38566b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38565a) {
            case 0:
                zn znVar = (zn) this.f38566b;
                znVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    znVar.ta();
                    return true;
                }
                return false;
            case 1:
                pn0 pn0Var = (pn0) this.f38566b;
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
                xv0 xv0Var = (xv0) this.f38566b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = xv0Var.f20200f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
