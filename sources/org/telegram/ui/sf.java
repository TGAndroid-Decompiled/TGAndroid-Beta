package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sf implements View.OnKeyListener {
    public final int f51208a;
    public final Object f51209b;

    public sf(Object obj, int i7) {
        this.f51208a = i7;
        this.f51209b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f51208a) {
            case 0:
                an anVar = (an) this.f51209b;
                anVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    anVar.Va();
                    return true;
                }
                return false;
            case 1:
                ek0 ek0Var = (ek0) this.f51209b;
                if (i7 == 67) {
                    if (ek0Var.Z[2].length() == 0) {
                        ek0Var.Z[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = ek0Var.Z[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        ek0Var.Z[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    ek0Var.getClass();
                }
                return false;
            default:
                kr0 kr0Var = (kr0) this.f51209b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = kr0Var.f32119f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
