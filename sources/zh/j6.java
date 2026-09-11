package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j6 implements Runnable {
    public final int f52107a;
    public final EditTextBoldCursor f52108b;
    public final org.telegram.ui.ActionBar.f3[] f52109c;

    public j6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f52107a = i10;
        this.f52108b = editTextBoldCursor;
        this.f52109c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f52107a) {
            case 0:
                this.f52109c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f52108b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new m2(editTextBoldCursor, 6));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f52108b);
                this.f52109c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f52108b);
                this.f52109c[0].dismiss();
                return;
        }
    }

    public j6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f52107a = 0;
        this.f52109c = f3VarArr;
        this.f52108b = editTextBoldCursor;
    }
}
