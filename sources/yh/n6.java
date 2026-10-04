package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class n6 implements Runnable {
    public final int f51690a;
    public final EditTextBoldCursor f51691b;
    public final org.telegram.ui.ActionBar.f3[] f51692c;

    public n6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f51690a = i10;
        this.f51691b = editTextBoldCursor;
        this.f51692c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f51690a) {
            case 0:
                this.f51692c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f51691b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r2(editTextBoldCursor, 5));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f51691b);
                this.f51692c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f51691b);
                this.f51692c[0].dismiss();
                return;
        }
    }

    public n6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f51690a = 0;
        this.f51692c = f3VarArr;
        this.f51691b = editTextBoldCursor;
    }
}
