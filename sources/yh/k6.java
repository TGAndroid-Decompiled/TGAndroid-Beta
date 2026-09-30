package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k6 implements Runnable {
    public final int f47620a;
    public final EditTextBoldCursor f47621b;
    public final org.telegram.ui.ActionBar.e3[] f47622c;

    public k6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f47620a = i10;
        this.f47621b = editTextBoldCursor;
        this.f47622c = e3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47620a) {
            case 0:
                this.f47622c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f47621b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r2(editTextBoldCursor, 4));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f47621b);
                this.f47622c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f47621b);
                this.f47622c[0].dismiss();
                return;
        }
    }

    public k6(org.telegram.ui.ActionBar.e3[] e3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47620a = 0;
        this.f47622c = e3VarArr;
        this.f47621b = editTextBoldCursor;
    }
}
