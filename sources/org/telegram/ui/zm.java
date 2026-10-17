package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class zm implements MessagesController.MessagesLoadedCallback {
    public final ti f43773a;
    public final sn f43774b;
    public final en f43775c;

    public zm(en enVar, ti tiVar, sn snVar) {
        this.f43775c = enVar;
        this.f43773a = tiVar;
        this.f43774b = snVar;
    }

    @Override
    public final void onError() {
        this.f43773a.c(false);
        this.f43775c.f36569a.presentFragment(this.f43774b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43773a.c(false);
        this.f43775c.f36569a.presentFragment(this.f43774b);
    }
}
