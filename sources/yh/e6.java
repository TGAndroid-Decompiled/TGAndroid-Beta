package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e6 implements Runnable {
    public final int f52672a;
    public final EditTextBoldCursor f52673b;
    public final org.telegram.ui.ActionBar.e3[] f52674c;

    public e6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f52672a = i10;
        this.f52673b = editTextBoldCursor;
        this.f52674c = e3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f52672a) {
            case 0:
                this.f52674c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f52673b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new f0(editTextBoldCursor, 8));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f52673b);
                this.f52674c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f52673b);
                this.f52674c[0].dismiss();
                return;
        }
    }

    public e6(org.telegram.ui.ActionBar.e3[] e3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f52672a = 0;
        this.f52674c = e3VarArr;
        this.f52673b = editTextBoldCursor;
    }
}
