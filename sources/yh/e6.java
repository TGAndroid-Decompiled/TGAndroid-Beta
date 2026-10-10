package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e6 implements Runnable {
    public final int f52492a;
    public final EditTextBoldCursor f52493b;
    public final org.telegram.ui.ActionBar.f3[] f52494c;

    public e6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f52492a = i10;
        this.f52493b = editTextBoldCursor;
        this.f52494c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f52492a) {
            case 0:
                this.f52494c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f52493b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new f0(editTextBoldCursor, 8));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f52493b);
                this.f52494c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f52493b);
                this.f52494c[0].dismiss();
                return;
        }
    }

    public e6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f52492a = 0;
        this.f52494c = f3VarArr;
        this.f52493b = editTextBoldCursor;
    }
}
