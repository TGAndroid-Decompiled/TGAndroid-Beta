package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ug implements View.OnKeyListener {
    public final int f42471a;
    public final Object f42472b;

    public ug(Object obj, int i10) {
        this.f42471a = i10;
        this.f42472b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f42471a) {
            case 0:
                zn znVar = (zn) this.f42472b;
                znVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    znVar.xa();
                    return true;
                }
                return false;
            case 1:
                nn0 nn0Var = (nn0) this.f42472b;
                if (i10 == 67) {
                    if (nn0Var.Y[2].length() == 0) {
                        nn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = nn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        nn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    nn0Var.getClass();
                }
                return false;
            default:
                xv0 xv0Var = (xv0) this.f42472b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = xv0Var.f21979f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
