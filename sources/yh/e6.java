package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e6 implements Runnable {
    public final int f52523a;
    public final EditTextBoldCursor f52524b;
    public final org.telegram.ui.ActionBar.e3[] f52525c;

    public e6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f52523a = i10;
        this.f52524b = editTextBoldCursor;
        this.f52525c = e3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f52523a) {
            case 0:
                this.f52525c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f52524b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new f0(editTextBoldCursor, 8));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f52524b);
                this.f52525c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f52524b);
                this.f52525c[0].dismiss();
                return;
        }
    }

    public e6(org.telegram.ui.ActionBar.e3[] e3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f52523a = 0;
        this.f52525c = e3VarArr;
        this.f52524b = editTextBoldCursor;
    }
}
