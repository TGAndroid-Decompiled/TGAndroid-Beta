package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wf implements View.OnKeyListener {
    public final int f51355a;
    public final Object f51356b;

    public wf(Object obj, int i7) {
        this.f51355a = i7;
        this.f51356b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f51355a) {
            case 0:
                cn cnVar = (cn) this.f51356b;
                cnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    cnVar.Ua();
                    return true;
                }
                return false;
            case 1:
                ek0 ek0Var = (ek0) this.f51356b;
                if (i7 == 67) {
                    if (ek0Var.Y[2].length() == 0) {
                        ek0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = ek0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        ek0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    ek0Var.getClass();
                }
                return false;
            default:
                pr0 pr0Var = (pr0) this.f51356b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = pr0Var.f28907f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
