package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wg implements View.OnKeyListener {
    public final int f38177a;
    public final Object f38178b;

    public wg(Object obj, int i10) {
        this.f38177a = i10;
        this.f38178b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38177a) {
            case 0:
                eo eoVar = (eo) this.f38178b;
                eoVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    eoVar.ta();
                    return true;
                }
                return false;
            case 1:
                on0 on0Var = (on0) this.f38178b;
                if (i10 == 67) {
                    if (on0Var.Y[2].length() == 0) {
                        on0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = on0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        on0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    on0Var.getClass();
                }
                return false;
            default:
                yv0 yv0Var = (yv0) this.f38178b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = yv0Var.f19076f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
