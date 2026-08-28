package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class tk implements MessagesStorage.IntCallback {
    public final qn f43025a;

    public tk(qn qnVar) {
        this.f43025a = qnVar;
    }

    @Override
    public final void run(int i9) {
        this.f43025a.G9(i9);
    }
}
