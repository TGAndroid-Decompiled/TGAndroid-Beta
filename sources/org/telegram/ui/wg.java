package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wg implements Runnable {
    public final int f44993a;
    public final wn f44994b;
    public final TLRPC.User f44995c;

    public wg(wn wnVar, TLRPC.User user, int i10) {
        this.f44993a = i10;
        this.f44994b = wnVar;
        this.f44995c = user;
    }

    @Override
    public final void run() {
        switch (this.f44993a) {
            case 0:
                wn wnVar = this.f44994b;
                wnVar.getClass();
                wnVar.presentFragment(wn.ea(this.f44995c.f22177id));
                return;
            default:
                this.f44994b.za(this.f44995c);
                return;
        }
    }
}
