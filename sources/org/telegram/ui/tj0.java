package org.telegram.ui;

import org.telegram.tgnet.tl.TL_feed;
public final class tj0 implements Runnable {
    public final int f43660a;
    public final zj0 f43661b;
    public final xj0 f43662c;

    public tj0(zj0 zj0Var, xj0 xj0Var, int i10) {
        this.f43660a = i10;
        this.f43661b = zj0Var;
        this.f43662c = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f43660a) {
            case 0:
                this.f43661b.m0(this.f43662c);
                return;
            default:
                xj0 xj0Var = this.f43662c;
                xj0Var.f45726q = null;
                TL_feed.TL_feed_readFeed tL_feed_readFeed = new TL_feed.TL_feed_readFeed();
                tL_feed_readFeed.max_position = xj0Var.f45725p;
                zj0 zj0Var = this.f43661b;
                zj0Var.getConnectionsManager().sendRequest(tL_feed_readFeed, new rj0(zj0Var, 1));
                return;
        }
    }
}
