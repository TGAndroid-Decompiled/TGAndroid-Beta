package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class xm implements MessagesController.MessagesLoadedCallback {
    public final ri f43238a;
    public final qn f43239b;
    public final cn f43240c;

    public xm(cn cnVar, ri riVar, qn qnVar) {
        this.f43240c = cnVar;
        this.f43238a = riVar;
        this.f43239b = qnVar;
    }

    @Override
    public final void onError() {
        this.f43238a.c(false);
        this.f43240c.f36004a.presentFragment(this.f43239b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f43238a.c(false);
        this.f43240c.f36004a.presentFragment(this.f43239b);
    }
}
