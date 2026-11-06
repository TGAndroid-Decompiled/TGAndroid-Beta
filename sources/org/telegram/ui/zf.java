package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zf implements View.OnKeyListener {
    public final int f52570a;
    public final Object f52571b;

    public zf(Object obj, int i7) {
        this.f52570a = i7;
        this.f52571b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f52570a) {
            case 0:
                an anVar = (an) this.f52571b;
                anVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    anVar.Sa();
                    return true;
                }
                return false;
            case 1:
                bk0 bk0Var = (bk0) this.f52571b;
                if (i7 == 67) {
                    if (bk0Var.Y[2].length() == 0) {
                        bk0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = bk0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        bk0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    bk0Var.getClass();
                }
                return false;
            default:
                lr0 lr0Var = (lr0) this.f52571b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = lr0Var.f28888f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
