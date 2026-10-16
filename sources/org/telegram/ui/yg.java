package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yg implements View.OnKeyListener {
    public final int f41824a;
    public final Object f41825b;

    public yg(Object obj, int i10) {
        this.f41824a = i10;
        this.f41825b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f41824a) {
            case 0:
                fo foVar = (fo) this.f41825b;
                foVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    foVar.xa();
                    return true;
                }
                return false;
            case 1:
                sn0 sn0Var = (sn0) this.f41825b;
                if (i10 == 67) {
                    if (sn0Var.Y[2].length() == 0) {
                        sn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = sn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        sn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    sn0Var.getClass();
                }
                return false;
            default:
                cw0 cw0Var = (cw0) this.f41825b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = cw0Var.f20767f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
