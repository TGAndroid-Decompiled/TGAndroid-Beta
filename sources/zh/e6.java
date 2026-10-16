package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e6 implements Runnable {
    public final int f50449a;
    public final EditTextBoldCursor f50450b;
    public final org.telegram.ui.ActionBar.e3[] f50451c;

    public e6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f50449a = i10;
        this.f50450b = editTextBoldCursor;
        this.f50451c = e3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f50449a) {
            case 0:
                this.f50451c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f50450b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new zf.c(editTextBoldCursor, 15));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f50450b);
                this.f50451c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f50450b);
                this.f50451c[0].dismiss();
                return;
        }
    }

    public e6(org.telegram.ui.ActionBar.e3[] e3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f50449a = 0;
        this.f50451c = e3VarArr;
        this.f50450b = editTextBoldCursor;
    }
}
