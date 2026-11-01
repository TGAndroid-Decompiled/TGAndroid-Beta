package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class yg implements Runnable {
    public final int f43661a;
    public final EditTextBoldCursor f43662b;

    public yg(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f43661a = i10;
        this.f43662b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f43661a) {
            case 0:
                org.telegram.messenger.i0.J3(this.f43662b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f43662b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f43662b;
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor2);
                return;
            case 3:
                org.telegram.messenger.i0.J3(this.f43662b);
                return;
            case 4:
                org.telegram.messenger.i0.J3(this.f43662b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f43662b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor3);
                return;
        }
    }
}
