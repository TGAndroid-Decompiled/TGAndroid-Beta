package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k6 implements Runnable {
    public final int f47301a;
    public final EditTextBoldCursor f47302b;
    public final org.telegram.ui.ActionBar.f3[] f47303c;

    public k6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f47301a = i10;
        this.f47302b = editTextBoldCursor;
        this.f47303c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47301a) {
            case 0:
                this.f47303c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f47302b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new w2(editTextBoldCursor, 3));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f47302b);
                this.f47303c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f47302b);
                this.f47303c[0].dismiss();
                return;
        }
    }

    public k6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47301a = 0;
        this.f47303c = f3VarArr;
        this.f47302b = editTextBoldCursor;
    }
}
