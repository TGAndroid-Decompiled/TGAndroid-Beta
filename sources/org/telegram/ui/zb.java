package org.telegram.ui;

import org.telegram.messenger.R;
public final class zb implements Runnable {
    public final int f45125a;
    public final vc f45126b;

    public zb(vc vcVar, int i10) {
        this.f45125a = i10;
        this.f45126b = vcVar;
    }

    @Override
    public final void run() {
        switch (this.f45125a) {
            case 0:
                vc.U(this.f45126b);
                return;
            default:
                j7.l1.v(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.tc.a0(this.f45126b), R.raw.done, 36);
                return;
        }
    }
}
