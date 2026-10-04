package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class n6 implements Runnable {
    public final int f51691a;
    public final EditTextBoldCursor f51692b;
    public final org.telegram.ui.ActionBar.f3[] f51693c;

    public n6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f51691a = i10;
        this.f51692b = editTextBoldCursor;
        this.f51693c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f51691a) {
            case 0:
                this.f51693c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f51692b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new n2(editTextBoldCursor, 6));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f51692b);
                this.f51693c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f51692b);
                this.f51693c[0].dismiss();
                return;
        }
    }

    public n6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f51691a = 0;
        this.f51693c = f3VarArr;
        this.f51692b = editTextBoldCursor;
    }
}
