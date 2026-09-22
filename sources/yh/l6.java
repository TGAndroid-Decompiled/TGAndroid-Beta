package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l6 implements Runnable {
    public final int f47717a;
    public final EditTextBoldCursor f47718b;
    public final org.telegram.ui.ActionBar.f3[] f47719c;

    public l6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f47717a = i10;
        this.f47718b = editTextBoldCursor;
        this.f47719c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47717a) {
            case 0:
                this.f47719c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f47718b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new s2(editTextBoldCursor, 4));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f47718b);
                this.f47719c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f47718b);
                this.f47719c[0].dismiss();
                return;
        }
    }

    public l6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47717a = 0;
        this.f47719c = f3VarArr;
        this.f47718b = editTextBoldCursor;
    }
}
