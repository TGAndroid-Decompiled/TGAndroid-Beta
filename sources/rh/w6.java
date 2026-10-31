package rh;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class w6 implements Runnable {
    public final int f47644a;
    public final EditTextBoldCursor f47645b;
    public final org.telegram.ui.ActionBar.z2[] f47646c;

    public w6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.z2[] z2VarArr, int i10) {
        this.f47644a = i10;
        this.f47645b = editTextBoldCursor;
        this.f47646c = z2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f47644a) {
            case 0:
                this.f47646c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.f47645b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.g3(new ph.x1(editTextBoldCursor, 24));
                return;
            case 1:
                org.telegram.messenger.i0.v1(this.f47645b);
                this.f47646c[0].dismiss();
                return;
            default:
                org.telegram.messenger.i0.v1(this.f47645b);
                this.f47646c[0].dismiss();
                return;
        }
    }

    public w6(org.telegram.ui.ActionBar.z2[] z2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.f47644a = 0;
        this.f47646c = z2VarArr;
        this.f47645b = editTextBoldCursor;
    }
}
