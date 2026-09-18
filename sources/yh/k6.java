package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k6 implements Runnable {
    public final int f47614a;
    public final EditTextBoldCursor f47615b;
    public final org.telegram.ui.ActionBar.f3[] f47616c;

    public k6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f47614a = i10;
        this.f47615b = editTextBoldCursor;
        this.f47616c = f3VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47614a) {
            case 0:
                this.f47616c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.f47615b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new w2(editTextBoldCursor, 3));
                return;
            case 1:
                AndroidUtilities.hideKeyboard(this.f47615b);
                this.f47616c[0].dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f47615b);
                this.f47616c[0].dismiss();
                return;
        }
    }

    public k6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47614a = 0;
        this.f47616c = f3VarArr;
        this.f47615b = editTextBoldCursor;
    }
}
