package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class ym implements MessagesController.MessagesLoadedCallback {
    public final ri f43899a;
    public final sn f43900b;
    public final dn f43901c;

    public ym(dn dnVar, ri riVar, sn snVar) {
        this.f43901c = dnVar;
        this.f43899a = riVar;
        this.f43900b = snVar;
    }

    @Override
    public final void onError() {
        this.f43899a.c(false);
        this.f43901c.f36660a.presentFragment(this.f43900b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43899a.c(false);
        this.f43901c.f36660a.presentFragment(this.f43900b);
    }
}
