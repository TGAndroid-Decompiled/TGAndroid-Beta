package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class xm implements MessagesController.MessagesLoadedCallback {
    public final ri f43248a;
    public final qn f43249b;
    public final cn f43250c;

    public xm(cn cnVar, ri riVar, qn qnVar) {
        this.f43250c = cnVar;
        this.f43248a = riVar;
        this.f43249b = qnVar;
    }

    @Override
    public final void onError() {
        this.f43248a.c(false);
        this.f43250c.f36015a.presentFragment(this.f43249b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43248a.c(false);
        this.f43250c.f36015a.presentFragment(this.f43249b);
    }
}
