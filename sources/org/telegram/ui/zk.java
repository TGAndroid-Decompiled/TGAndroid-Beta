package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class zk implements MessagesStorage.IntCallback {
    public final sn f44169a;

    public zk(sn snVar) {
        this.f44169a = snVar;
    }

    @Override
    public final void run(int i10) {
        this.f44169a.L9(i10);
    }
}
