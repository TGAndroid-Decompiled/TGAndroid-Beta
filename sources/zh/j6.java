package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j6 implements Runnable {
    public final int f52139a;
    public final EditTextBoldCursor f52140b;
    public final org.telegram.ui.ActionBar.f3[] f52141c;

    public j6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f52139a = i10;
        this.f52140b = editTextBoldCursor;
        this.f52141c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f52139a) {
            case 0:
                this.f52141c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f52140b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new m2(editTextBoldCursor, 6));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f52140b);
                this.f52141c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f52140b);
                this.f52141c[0].dismiss();
                return;
        }
    }

    public j6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f52139a = 0;
        this.f52141c = f3VarArr;
        this.f52140b = editTextBoldCursor;
    }
}
