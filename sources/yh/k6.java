package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k6 implements Runnable {
    public final int f47618a;
    public final EditTextBoldCursor f47619b;
    public final org.telegram.ui.ActionBar.e3[] f47620c;

    public k6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f47618a = i10;
        this.f47619b = editTextBoldCursor;
        this.f47620c = e3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47618a) {
            case 0:
                this.f47620c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f47619b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r2(editTextBoldCursor, 4));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f47619b);
                this.f47620c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f47619b);
                this.f47620c[0].dismiss();
                return;
        }
    }

    public k6(org.telegram.ui.ActionBar.e3[] e3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47618a = 0;
        this.f47620c = e3VarArr;
        this.f47619b = editTextBoldCursor;
    }
}
