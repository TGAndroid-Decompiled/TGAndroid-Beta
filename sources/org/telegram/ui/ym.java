package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class ym implements MessagesController.MessagesLoadedCallback {
    public final ri f43887a;
    public final sn f43888b;
    public final dn f43889c;

    public ym(dn dnVar, ri riVar, sn snVar) {
        this.f43889c = dnVar;
        this.f43887a = riVar;
        this.f43888b = snVar;
    }

    @Override
    public final void onError() {
        this.f43887a.c(false);
        this.f43889c.f36651a.presentFragment(this.f43888b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43887a.c(false);
        this.f43889c.f36651a.presentFragment(this.f43888b);
    }
}
