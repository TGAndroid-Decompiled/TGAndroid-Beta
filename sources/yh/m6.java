package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m6 implements Runnable {
    public final int f47465a;
    public final EditTextBoldCursor f47466b;
    public final org.telegram.ui.ActionBar.f3[] f47467c;

    public m6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f47465a = i10;
        this.f47466b = editTextBoldCursor;
        this.f47467c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47465a) {
            case 0:
                this.f47467c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f47466b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new y2(editTextBoldCursor, 3));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f47466b);
                this.f47467c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f47466b);
                this.f47467c[0].dismiss();
                return;
        }
    }

    public m6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47465a = 0;
        this.f47467c = f3VarArr;
        this.f47466b = editTextBoldCursor;
    }
}
