package rh;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class w6 implements Runnable {
    public final int f47654a;
    public final EditTextBoldCursor f47655b;
    public final org.telegram.ui.ActionBar.z2[] f47656c;

    public w6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.z2[] z2VarArr, int i10) {
        this.f47654a = i10;
        this.f47655b = editTextBoldCursor;
        this.f47656c = z2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47654a) {
            case 0:
                this.f47656c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f47655b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.g3(new ph.x1(editTextBoldCursor, 24));
                return;
            case 1:
                org.telegram.messenger.i0.v1(this.f47655b);
                this.f47656c[0].dismiss();
                return;
            default:
                org.telegram.messenger.i0.v1(this.f47655b);
                this.f47656c[0].dismiss();
                return;
        }
    }

    public w6(org.telegram.ui.ActionBar.z2[] z2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47654a = 0;
        this.f47656c = z2VarArr;
        this.f47655b = editTextBoldCursor;
    }
}
