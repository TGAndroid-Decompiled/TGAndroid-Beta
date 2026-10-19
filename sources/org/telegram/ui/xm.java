package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class xm implements MessagesController.MessagesLoadedCallback {
    public final ri f43234a;
    public final qn f43235b;
    public final cn f43236c;

    public xm(cn cnVar, ri riVar, qn qnVar) {
        this.f43236c = cnVar;
        this.f43234a = riVar;
        this.f43235b = qnVar;
    }

    @Override
    public final void onError() {
        this.f43234a.c(false);
        this.f43236c.f36032a.presentFragment(this.f43235b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43234a.c(false);
        this.f43236c.f36032a.presentFragment(this.f43235b);
    }
}
