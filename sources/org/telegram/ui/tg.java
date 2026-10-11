package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tg implements View.OnKeyListener {
    public final int f42182a;
    public final Object f42183b;

    public tg(Object obj, int i10) {
        this.f42182a = i10;
        this.f42183b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f42182a) {
            case 0:
                zn znVar = (zn) this.f42183b;
                znVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    znVar.xa();
                    return true;
                }
                return false;
            case 1:
                mn0 mn0Var = (mn0) this.f42183b;
                if (i10 == 67) {
                    if (mn0Var.Y[2].length() == 0) {
                        mn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = mn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        mn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    mn0Var.getClass();
                }
                return false;
            default:
                wv0 wv0Var = (wv0) this.f42183b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = wv0Var.f21967f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
