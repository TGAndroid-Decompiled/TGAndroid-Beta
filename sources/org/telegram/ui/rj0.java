package org.telegram.ui;

import org.telegram.tgnet.tl.TL_feed;
public final class rj0 implements Runnable {
    public final int f43171a;
    public final xj0 f43172b;
    public final vj0 f43173c;

    public rj0(xj0 xj0Var, vj0 vj0Var, int i10) {
        this.f43171a = i10;
        this.f43172b = xj0Var;
        this.f43173c = vj0Var;
    }

    @Override
    public final void run() {
        switch (this.f43171a) {
            case 0:
                this.f43172b.m0(this.f43173c);
                return;
            default:
                vj0 vj0Var = this.f43173c;
                vj0Var.f44848q = null;
                TL_feed.TL_feed_readFeed tL_feed_readFeed = new TL_feed.TL_feed_readFeed();
                tL_feed_readFeed.max_position = vj0Var.f44847p;
                xj0 xj0Var = this.f43172b;
                xj0Var.getConnectionsManager().sendRequest(tL_feed_readFeed, new pj0(xj0Var, 1));
                return;
        }
    }
}
