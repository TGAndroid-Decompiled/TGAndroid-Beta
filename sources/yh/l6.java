package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l6 implements Runnable {
    public final int f47369a;
    public final EditTextBoldCursor f47370b;
    public final org.telegram.ui.ActionBar.f3[] f47371c;

    public l6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f47369a = i10;
        this.f47370b = editTextBoldCursor;
        this.f47371c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47369a) {
            case 0:
                this.f47371c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f47370b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new x2(editTextBoldCursor, 3));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f47370b);
                this.f47371c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f47370b);
                this.f47371c[0].dismiss();
                return;
        }
    }

    public l6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47369a = 0;
        this.f47371c = f3VarArr;
        this.f47370b = editTextBoldCursor;
    }
}
