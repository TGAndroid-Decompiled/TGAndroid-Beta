package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e6 implements Runnable {
    public final int f52660a;
    public final EditTextBoldCursor f52661b;
    public final org.telegram.ui.ActionBar.e3[] f52662c;

    public e6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f52660a = i10;
        this.f52661b = editTextBoldCursor;
        this.f52662c = e3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f52660a) {
            case 0:
                this.f52662c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f52661b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new f0(editTextBoldCursor, 8));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f52661b);
                this.f52662c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f52661b);
                this.f52662c[0].dismiss();
                return;
        }
    }

    public e6(org.telegram.ui.ActionBar.e3[] e3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f52660a = 0;
        this.f52662c = e3VarArr;
        this.f52661b = editTextBoldCursor;
    }
}
