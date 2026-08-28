package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class xm implements MessagesController.MessagesLoadedCallback {
    public final oi f44542a;
    public final qn f44543b;
    public final cn f44544c;

    public xm(cn cnVar, oi oiVar, qn qnVar) {
        this.f44544c = cnVar;
        this.f44542a = oiVar;
        this.f44543b = qnVar;
    }

    @Override
    public final void onError() {
        this.f44542a.c(false);
        this.f44544c.f37236a.presentFragment(this.f44543b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f44542a.c(false);
        this.f44544c.f37236a.presentFragment(this.f44543b);
    }
}
