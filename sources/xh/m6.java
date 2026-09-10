package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m6 implements Runnable {
    public final int f45719a;
    public final EditTextBoldCursor f45720b;
    public final org.telegram.ui.ActionBar.h3[] f45721c;

    public m6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f45719a = i10;
        this.f45720b = editTextBoldCursor;
        this.f45721c = h3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f45719a) {
            case 0:
                this.f45721c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f45720b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new x(editTextBoldCursor, 10));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f45720b);
                this.f45721c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f45720b);
                this.f45721c[0].dismiss();
                return;
        }
    }

    public m6(org.telegram.ui.ActionBar.h3[] h3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f45719a = 0;
        this.f45721c = h3VarArr;
        this.f45720b = editTextBoldCursor;
    }
}
