package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sg implements View.OnKeyListener {
    public final int f37850a;
    public final Object f37851b;

    public sg(Object obj, int i10) {
        this.f37850a = i10;
        this.f37851b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f37850a) {
            case 0:
                wn wnVar = (wn) this.f37851b;
                wnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    wnVar.ta();
                    return true;
                }
                return false;
            case 1:
                fn0 fn0Var = (fn0) this.f37851b;
                if (i10 == 67) {
                    if (fn0Var.Y[2].length() == 0) {
                        fn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = fn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        fn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    fn0Var.getClass();
                }
                return false;
            default:
                ov0 ov0Var = (ov0) this.f37851b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = ov0Var.f20154f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
