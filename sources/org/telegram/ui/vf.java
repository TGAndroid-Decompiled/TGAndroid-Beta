package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vf implements View.OnKeyListener {
    public final int f50470a;
    public final Object f50471b;

    public vf(Object obj, int i3) {
        this.f50470a = i3;
        this.f50471b = obj;
    }

    @Override
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        switch (this.f50470a) {
            case 0:
                wm wmVar = (wm) this.f50471b;
                wmVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i3 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    wmVar.Sa();
                    return true;
                }
                return false;
            case 1:
                yj0 yj0Var = (yj0) this.f50471b;
                if (i3 == 67) {
                    if (yj0Var.Z[2].length() == 0) {
                        yj0Var.Z[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = yj0Var.Z[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        yj0Var.Z[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    yj0Var.getClass();
                }
                return false;
            default:
                cr0 cr0Var = (cr0) this.f50471b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i3 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = cr0Var.f31049f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
