package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class sg implements Runnable {
    public final int f49759a;
    public final EditTextBoldCursor f49760b;

    public sg(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f49759a = i7;
        this.f49760b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f49759a) {
            case 0:
                org.telegram.messenger.g0.K3(this.f49760b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f49760b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f49760b;
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor2);
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f49760b);
                return;
            case 4:
                org.telegram.messenger.g0.K3(this.f49760b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f49760b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor3);
                return;
        }
    }
}
