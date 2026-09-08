package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j6 implements Runnable {
    public final int f52138a;
    public final EditTextBoldCursor f52139b;
    public final org.telegram.ui.ActionBar.f3[] f52140c;

    public j6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f52138a = i10;
        this.f52139b = editTextBoldCursor;
        this.f52140c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f52138a) {
            case 0:
                this.f52140c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f52139b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new m2(editTextBoldCursor, 6));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f52139b);
                this.f52140c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f52139b);
                this.f52140c[0].dismiss();
                return;
        }
    }

    public j6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f52138a = 0;
        this.f52140c = f3VarArr;
        this.f52139b = editTextBoldCursor;
    }
}
