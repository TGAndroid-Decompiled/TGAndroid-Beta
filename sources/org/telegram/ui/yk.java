package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class yk implements MessagesStorage.IntCallback {
    public final qn f43506a;

    public yk(qn qnVar) {
        this.f43506a = qnVar;
    }

    @Override
    public final void run(int i10) {
        this.f43506a.L9(i10);
    }
}
