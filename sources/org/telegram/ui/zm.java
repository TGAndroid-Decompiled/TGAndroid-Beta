package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class zm implements MessagesController.MessagesLoadedCallback {
    public final ti f43799a;
    public final sn f43800b;
    public final en f43801c;

    public zm(en enVar, ti tiVar, sn snVar) {
        this.f43801c = enVar;
        this.f43799a = tiVar;
        this.f43800b = snVar;
    }

    @Override
    public final void onError() {
        this.f43799a.c(false);
        this.f43801c.f36573a.presentFragment(this.f43800b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43799a.c(false);
        this.f43801c.f36573a.presentFragment(this.f43800b);
    }
}
