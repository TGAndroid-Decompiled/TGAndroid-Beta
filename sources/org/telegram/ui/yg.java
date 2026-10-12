package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yg implements View.OnKeyListener {
    public final int f42157a;
    public final Object f42158b;

    public yg(Object obj, int i10) {
        this.f42157a = i10;
        this.f42158b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f42157a) {
            case 0:
                fo foVar = (fo) this.f42158b;
                foVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    foVar.xa();
                    return true;
                }
                return false;
            case 1:
                un0 un0Var = (un0) this.f42158b;
                if (i10 == 67) {
                    if (un0Var.Y[2].length() == 0) {
                        un0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = un0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        un0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    un0Var.getClass();
                }
                return false;
            default:
                dw0 dw0Var = (dw0) this.f42158b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = dw0Var.f21072f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
