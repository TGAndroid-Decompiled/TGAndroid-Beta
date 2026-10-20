package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class xm implements MessagesController.MessagesLoadedCallback {
    public final ri f43244a;
    public final qn f43245b;
    public final cn f43246c;

    public xm(cn cnVar, ri riVar, qn qnVar) {
        this.f43246c = cnVar;
        this.f43244a = riVar;
        this.f43245b = qnVar;
    }

    @Override
    public final void onError() {
        this.f43244a.c(false);
        this.f43246c.f36010a.presentFragment(this.f43245b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43244a.c(false);
        this.f43246c.f36010a.presentFragment(this.f43245b);
    }
}
