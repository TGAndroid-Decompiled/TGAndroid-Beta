package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zr implements Runnable {
    public final int f46349a;
    public final js f46350b;

    public zr(js jsVar, int i10) {
        this.f46349a = i10;
        this.f46350b = jsVar;
    }

    @Override
    public final void run() {
        switch (this.f46349a) {
            case 0:
                js.Z(this.f46350b);
                return;
            case 1:
                js jsVar = this.f46350b;
                if (jsVar.J) {
                    jsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(jsVar.d.d);
                    return;
                }
                return;
            default:
                js jsVar2 = this.f46350b;
                jsVar2.presentFragment(un.ba(jsVar2.H), true);
                return;
        }
    }
}
