package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class n6 implements Runnable {
    public final int f51689a;
    public final EditTextBoldCursor f51690b;
    public final org.telegram.ui.ActionBar.f3[] f51691c;

    public n6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f51689a = i10;
        this.f51690b = editTextBoldCursor;
        this.f51691c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f51689a) {
            case 0:
                this.f51691c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f51690b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r2(editTextBoldCursor, 5));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f51690b);
                this.f51691c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f51690b);
                this.f51691c[0].dismiss();
                return;
        }
    }

    public n6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f51689a = 0;
        this.f51691c = f3VarArr;
        this.f51690b = editTextBoldCursor;
    }
}
