package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class zm implements MessagesController.MessagesLoadedCallback {
    public final ti f43759a;
    public final sn f43760b;
    public final en f43761c;

    public zm(en enVar, ti tiVar, sn snVar) {
        this.f43761c = enVar;
        this.f43759a = tiVar;
        this.f43760b = snVar;
    }

    @Override
    public final void onError() {
        this.f43759a.c(false);
        this.f43761c.f36557a.presentFragment(this.f43760b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43759a.c(false);
        this.f43761c.f36557a.presentFragment(this.f43760b);
    }
}
