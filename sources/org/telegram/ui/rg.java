package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class rg implements Runnable {
    public final int f49408a;
    public final EditTextBoldCursor f49409b;

    public rg(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f49408a = i7;
        this.f49409b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.f49408a) {
            case 0:
                org.telegram.messenger.g0.K3(this.f49409b);
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.f49409b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = this.f49409b;
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor2);
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f49409b);
                return;
            case 4:
                org.telegram.messenger.g0.K3(this.f49409b);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor3 = this.f49409b;
                editTextBoldCursor3.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor3);
                return;
        }
    }
}
