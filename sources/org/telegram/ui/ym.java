package org.telegram.ui;

import org.telegram.messenger.MessagesController;

public final class ym implements MessagesController.MessagesLoadedCallback {

    public final qi f44847a;

    public final rn f44848b;

    public final dn f44849c;

    public ym(dn dnVar, qi qiVar, rn rnVar) {
        this.f44849c = dnVar;
        this.f44847a = qiVar;
        this.f44848b = rnVar;
    }

    @Override
    public final void onError() {
        this.f44847a.c(false);
        this.f44849c.f37446a.presentFragment(this.f44848b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f44847a.c(false);
        this.f44849c.f37446a.presentFragment(this.f44848b);
    }
}
