package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sg implements View.OnKeyListener {
    public final int f37753a;
    public final Object f37754b;

    public sg(Object obj, int i10) {
        this.f37753a = i10;
        this.f37754b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f37753a) {
            case 0:
                wn wnVar = (wn) this.f37754b;
                wnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    wnVar.ta();
                    return true;
                }
                return false;
            case 1:
                gn0 gn0Var = (gn0) this.f37754b;
                if (i10 == 67) {
                    if (gn0Var.Y[2].length() == 0) {
                        gn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = gn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        gn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    gn0Var.getClass();
                }
                return false;
            default:
                ov0 ov0Var = (ov0) this.f37754b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = ov0Var.f20137f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
