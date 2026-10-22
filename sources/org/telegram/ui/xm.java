package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class xm implements MessagesController.MessagesLoadedCallback {
    public final ri f43247a;
    public final qn f43248b;
    public final cn f43249c;

    public xm(cn cnVar, ri riVar, qn qnVar) {
        this.f43249c = cnVar;
        this.f43247a = riVar;
        this.f43248b = qnVar;
    }

    @Override
    public final void onError() {
        this.f43247a.c(false);
        this.f43249c.f36014a.presentFragment(this.f43248b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43247a.c(false);
        this.f43249c.f36014a.presentFragment(this.f43248b);
    }
}
