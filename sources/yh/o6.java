package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o6 implements Runnable {
    public final int f51738a;
    public final EditTextBoldCursor f51739b;
    public final org.telegram.ui.ActionBar.f3[] f51740c;

    public o6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f51738a = i10;
        this.f51739b = editTextBoldCursor;
        this.f51740c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f51738a) {
            case 0:
                this.f51740c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f51739b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new o2(editTextBoldCursor, 6));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f51739b);
                this.f51740c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f51739b);
                this.f51740c[0].dismiss();
                return;
        }
    }

    public o6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f51738a = 0;
        this.f51740c = f3VarArr;
        this.f51739b = editTextBoldCursor;
    }
}
