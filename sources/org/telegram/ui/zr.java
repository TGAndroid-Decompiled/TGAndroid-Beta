package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zr implements Runnable {
    public final int f46352a;
    public final js f46353b;

    public zr(js jsVar, int i10) {
        this.f46352a = i10;
        this.f46353b = jsVar;
    }

    @Override
    public final void run() {
        switch (this.f46352a) {
            case 0:
                js.Z(this.f46353b);
                return;
            case 1:
                js jsVar = this.f46353b;
                if (jsVar.J) {
                    jsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(jsVar.d.d);
                    return;
                }
                return;
            default:
                js jsVar2 = this.f46353b;
                jsVar2.presentFragment(un.ba(jsVar2.H), true);
                return;
        }
    }
}
