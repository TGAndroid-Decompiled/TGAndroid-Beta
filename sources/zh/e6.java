package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e6 implements Runnable {
    public final int f50448a;
    public final EditTextBoldCursor f50449b;
    public final org.telegram.ui.ActionBar.e3[] f50450c;

    public e6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f50448a = i10;
        this.f50449b = editTextBoldCursor;
        this.f50450c = e3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f50448a) {
            case 0:
                this.f50450c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f50449b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new zf.c(editTextBoldCursor, 15));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f50449b);
                this.f50450c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f50449b);
                this.f50450c[0].dismiss();
                return;
        }
    }

    public e6(org.telegram.ui.ActionBar.e3[] e3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f50448a = 0;
        this.f50450c = e3VarArr;
        this.f50449b = editTextBoldCursor;
    }
}
