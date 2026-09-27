package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j6 implements Runnable {
    public final int f47628a;
    public final EditTextBoldCursor f47629b;
    public final org.telegram.ui.ActionBar.g3[] f47630c;

    public j6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f47628a = i10;
        this.f47629b = editTextBoldCursor;
        this.f47630c = g3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47628a) {
            case 0:
                this.f47630c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f47629b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r2(editTextBoldCursor, 4));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f47629b);
                this.f47630c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f47629b);
                this.f47630c[0].dismiss();
                return;
        }
    }

    public j6(org.telegram.ui.ActionBar.g3[] g3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47628a = 0;
        this.f47630c = g3VarArr;
        this.f47629b = editTextBoldCursor;
    }
}
