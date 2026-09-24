package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k6 implements Runnable {
    public final int f47607a;
    public final EditTextBoldCursor f47608b;
    public final org.telegram.ui.ActionBar.e3[] f47609c;

    public k6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f47607a = i10;
        this.f47608b = editTextBoldCursor;
        this.f47609c = e3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47607a) {
            case 0:
                this.f47609c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f47608b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r2(editTextBoldCursor, 4));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f47608b);
                this.f47609c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f47608b);
                this.f47609c[0].dismiss();
                return;
        }
    }

    public k6(org.telegram.ui.ActionBar.e3[] e3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47607a = 0;
        this.f47609c = e3VarArr;
        this.f47608b = editTextBoldCursor;
    }
}
